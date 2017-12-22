package com.metod.ws.ws;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.activation.DataHandler;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

@WebService
@MTOM
public class WSObject {

    @WebMethod
    public DataHandler downloadData() {
        MyDataSource dataSource = new MyDataSource();
        DataHandler dataHandler = new DataHandler(dataSource);
        return dataHandler;
    }

    @WebMethod
    public String uploadData(final DataHandler upload) {
        try {
            InputStream inputStream = upload.getInputStream();
            FileOutputStream fos = new FileOutputStream(new File("myFile.dat"));

            byte[] buffer = new byte[8 * 1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                fos.write(buffer,
                          0,
                          bytesRead);
            }
            fos.close();
            inputStream.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "ok";
    }

    @Oneway
    public void testVoid() {
    }

    public String helloWorld(final String name) {
        return "hello world " + name;
    }
}
