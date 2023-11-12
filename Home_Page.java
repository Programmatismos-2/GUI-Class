import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Home_Page {
    static ImageIcon logo = new ImageIcon("C:/Users/first/Downloads/Sky Logo.png");    //Αυτο το path θα πρεπει να αλλάξει ώστε η εικόνα να βρίσκεται στον κοινό φάκελο με το project
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Αρχικό Παράθυρο");   //Βαζει τιτλο στο frame
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Κλεινει το παραθυρο οταν καποιος παταει το x
        mainFrame.setSize(800, 530);    //Καθορίζει το μέγεθος του παραθυρου 
        mainFrame.setLayout(null);      //Προσδιορίζει το είδος του layout που εχει το frame

        mainFrame.setIconImage(logo.getImage());    //Θέτει την εικονα με το παραπανω path σαν logo του παραθύρου
        mainFrame.getContentPane().setBackground(new Color(0,220,250));     //Προσδιορίζει το χρώμα του background

        ImageIcon homePic = new ImageIcon("C:/Users/first/Pictures/HomePlane1.jpg");    //Αυτο το path θα πρεπει να αλλάξει ώστε η εικόνα να βρίσκεται στον κοινό φάκελο με το project
        JLabel lab1 = new JLabel(homePic);  //Εισάγω την φωτογραφία background σαν JLabel
        lab1.setSize(800, 530); //Ορίζω το μέγεθος του label ίδιο με του frame
        mainFrame.add(lab1);    //Προσθέτω το label στο frame

        JButton chatbotButton = new JButton("Εξυπηρέτηση Πελατών");     //Φτιάχνει κουμπί με όνομα "Εξυπηρέτηση Πελατών"
        JButton checkButton = new JButton("Check In");     //Φτιάχνει κουμπί με όνομα "Check In"
        
        chatbotButton.setBounds(150, 265, 200, 50);    //Προσδιορίζει το μέγεθος του κουμπιου
        checkButton.setBounds(450, 265, 200, 50);  //Προσδιορίζει το μέγεθος του κουμπιου
        chatbotButton.setBorder(BorderFactory.createEtchedBorder());
        checkButton.setBorder(BorderFactory.createEtchedBorder());
        checkButton.setFocusable(true);
        chatbotButton.setFocusable(false);
        
        /*ImageIcon chatIcon = new ImageIcon("C:/Users/first/Pictures/chatbot.jpg");  //Αυτο το path θα πρεπει να αλλάξει ώστε η εικόνα να βρίσκεται στον κοινό φάκελο με το project
        chatbotButton.setIcon(chatIcon);    //Βάζει φωτογραφία δίπλα από το κάθε κουμπι
        ImageIcon bookIcon = new ImageIcon("C:/Users/first/Pictures/Plane.png");    //Αυτο το path θα πρεπει να αλλάξει ώστε η εικόνα να βρίσκεται στον κοινό φάκελο με το project
        checkButton.setIcon(bookIcon);  //Βάζει φωτογραφία δίπλα από το κάθε κουμπι
        */
        
        mainFrame.add(chatbotButton);       //Προσθέτει το chatbotButton στο frame
        mainFrame.add(checkButton);     //Προσθέτει το checkButton στο frame
        mainFrame.setVisible(true);     //Εμφανίζει τα componets στο παραθυρο

        chatbotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(false);    //Κλείνει το home page
                ChatBotPage chat = new ChatBotPage();
                chat.openChatbotWindow();   //Ανοίγει το παραθυρο που ευθύνεται για το chatbot 
            }
        });
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(false);    //Κλείνει το home page και όταν τελείωσει η διαδικασία θα το ξανανοιξουμε 
                CheckInPage checkpage = new CheckInPage();
                chpage.opencheckWindow();   //Ανοίγει το παράθυρο που ευθύνεται για τις κρατήσεις
                mainFrame.setVisible(true);
            }
        });
        
        mainFrame.add(checkButton);     //Προσθέτει το checkButton στο frame
        mainFrame.add(chatbotButton);       //Προσθέτει το chatbotButton στο frame
        mainFrame.setVisible(true);     //Εμφανίζει τα componets στο παραθυρο
    }
    
}
