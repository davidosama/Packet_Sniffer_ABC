package sample;

import com.intellij.codeInspection.dataFlow.Trap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.BasicConfigurator;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;
import pcapF.Loop;

import java.net.Inet4Address;
import java.net.InetAddress;

import javax.xml.bind.DatatypeConverter;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        BasicConfigurator.configure();
        //launch(args);

       /*  String hex = "01 00 5e 00 00 fc 90 2b 34 10 d2 b9 08 00 45 00 00 3d 63 18 00 00 01 11 00 00 c0 a8 01 08 e0 00 00 fc ef 83 14 eb 00 29 a2 e7 29 7a 00 00 00 01 00 00 00 00 00 00 0f 64 65 73 6b 74 6f 70 2d 64 61 72 35 63 6f 62 00 00 01 00 01";
       hex = hex.replaceAll("\\s","");

       try {
           byte[] bytes = Hex.decodeHex(hex.toCharArray());
           System.out.println(new String(bytes, "UTF-8"));
       }catch (Exception e) {

           System.out.println(e.toString());
       }
      */

    }
}
