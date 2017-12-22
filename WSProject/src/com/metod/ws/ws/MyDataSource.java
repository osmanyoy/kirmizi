package com.metod.ws.ws;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataSource;

public class MyDataSource implements DataSource {

    @Override
    public String getContentType() {
        return "application/octet-string";
    }

    @Override
    public InputStream getInputStream() throws IOException {
        byte[] bytes = { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f };
        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(bytes);
        return arrayInputStream;
    }

    @Override
    public String getName() {
        return "file.dat";
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return null;
    }

}
