package QR_Code_Generation;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;

public class QR_Reader_UsingJava {
    public static void main(String[] args) throws Exception{
        JFileChooser ch=new JFileChooser();
        ch.showOpenDialog(null);
        File file=ch.getSelectedFile();
        if(file==null){
            throw new Exception("invalid file....");
        }
        Result r=new MultiFormatReader().decode(new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(file)))));
        System.out.println(r.getText());
    }
}
