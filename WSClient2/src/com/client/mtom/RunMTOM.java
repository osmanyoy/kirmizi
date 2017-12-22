package com.client.mtom;

public class RunMTOM {
    public static void main(final String[] args) {
        WSObjectService wsObjectService = new WSObjectService();
        WSObject wsObjectPort = wsObjectService.getWSObjectPort();
        byte[] downloadData = wsObjectPort.downloadData();
        System.out.println(downloadData);
    }
}
