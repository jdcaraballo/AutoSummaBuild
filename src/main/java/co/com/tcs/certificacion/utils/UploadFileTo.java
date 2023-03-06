package co.com.tcs.certificacion.utils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFileTo{
 public static void validFormat(String filePath){

     String filePath1 = ("C:\\Users\\2462952\\Downloads\\TestUpload\\PlantillaAuxiliosCorta00.xlsx");

        try {
            Robot objRobot = new Robot();
            Thread.sleep(5000);
            StringSelection str = new StringSelection(filePath1);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
            objRobot.keyPress(KeyEvent.VK_CONTROL);
            objRobot.keyPress(KeyEvent.VK_V);
            objRobot.keyRelease(KeyEvent.VK_CONTROL);
            objRobot.keyRelease(KeyEvent.VK_V);
            Thread.sleep(200);
            objRobot.keyPress(KeyEvent.VK_ENTER);
            objRobot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
