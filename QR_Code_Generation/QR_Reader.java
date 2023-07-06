package QR_Code_Generation;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class QR_Reader {
    public static void main(String[] args) throws Exception{
        File file=new File("C:\\Users\\Ishanu Goswami\\IdeaProjects\\qr-code.png");
        String content="Hello!!! This is Ishanu Goswami...";
        ByteArrayOutputStream out =QRCode.from(content).to(ImageType.PNG).stream();
        FileOutputStream fos=new FileOutputStream(file);
        fos.write(out.toByteArray());
        fos.close();
    }
}
