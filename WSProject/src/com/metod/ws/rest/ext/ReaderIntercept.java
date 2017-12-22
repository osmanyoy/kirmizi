package com.metod.ws.rest.ext;

import java.io.IOException;
import java.util.zip.GZIPInputStream;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;

@Provider
public class ReaderIntercept implements ReaderInterceptor {

    @Override
    public Object aroundReadFrom(final ReaderInterceptorContext context) throws IOException, WebApplicationException {
        // MediaType mediaType = context.getMediaType();
        // if (mediaType.getType()
        // .equals("zip")) {
        // GZIPInputStream gzipInputStream = new
        // GZIPInputStream(context.getInputStream());
        // context.setInputStream(gzipInputStream);
        // return context.proceed();
        // }
        Object first = context.getHeaders()
                              .getFirst("zipme");
        if (first != null) {
            GZIPInputStream gzipInputStream = new GZIPInputStream(context.getInputStream());
            context.setInputStream(gzipInputStream);
            return context.proceed();
        }
        return context.proceed();
    }

}
