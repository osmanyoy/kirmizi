package com.metod.ws.rest.ext;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

@Provider
public class WriterIntercept implements WriterInterceptor {

    @Override
    public void aroundWriteTo(final WriterInterceptorContext context) throws IOException, WebApplicationException {

        // MediaType mediaType = context.getMediaType();
        // if (mediaType.getType()
        // .equals("zip")) {
        // GZIPOutputStream outputStream = new
        // GZIPOutputStream(context.getOutputStream());
        // context.setOutputStream(outputStream);
        // }
        Object first = context.getHeaders()
                              .getFirst("zipme");
        if (first != null) {
            GZIPOutputStream outputStream = new GZIPOutputStream(context.getOutputStream());
            context.setOutputStream(outputStream);
        }

        context.proceed();

    }

}
