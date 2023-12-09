package org.example;

import javax.swing.*;
import java.awt.*;
//JFrame yapısını kullanarak butonlarımızı oluşturup şekil ve düzenlerini ayarlamaya başlıyouz.
public class ButtonContainer extends JFrame {
    CustomButton btn1;
    CustomButton btn2;
    CustomButton btn3;
    CustomButton btn4;
    CustomButton btn5;
    CustomButton btn6;
    CustomButton btn7;
    CustomButton btn8;
    CustomButton btn9;
    CustomButton btn10;
    CustomButton btn11;
    CustomButton btn12;
    CustomButton btn13;
    CustomButton btn14;
    CustomButton btn15;
    CustomButton btn16;
   //butonla ilgili görüntü ve işlemlerin tanımlandığı algoritma yapısını yazıyoruz.
    public ButtonContainer() {
        setTitle("Custom Button Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4, 10, 10));

        initializeButtons();

        setButtonsClickListeners();


        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn10);
        add(btn11);
        add(btn12);
        add(btn13);
        add(btn14);
        add(btn15);
        add(btn16);


    }
   // Aşağıdaki Kod dizisi Java Swing uygulamasında 16 adet JButton
   // nesnesine tıklama olaylarını dinleyen bir dizi ActionListener eklemek için yazıldı .
    private void setButtonsClickListeners() {
        btn1.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn1);
        });
        btn2.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn2);
        });
        btn3.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn3);
        });
        btn4.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn4);
        });
        btn5.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn5);
        });
        btn6.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn6);
        });
        btn7.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn7);
        });
        btn8.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn8);
        });
        btn9.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn9);
        });
        btn10.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn10);
        });
        btn11.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn11);
        });
        btn12.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn12);
        });
        btn13.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn13);
        });
        btn14.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn14);
        });
        btn15.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn15);
        });
        btn16.addActionListener(e->{
            checkForRoyalsAndApplyAlgorithm(btn16);
        });
    }
 //Tanımlarda yaptığımız Royal durumunu kontrol etmek için ve bulunduğu halde ne yapacağını bildirmek
 // için yazdığımız bir kod dizisidir.
    private void checkForRoyalsAndApplyAlgorithm(CustomButton btn) {
        if (isThereAnyRoyalBtn()){
            if (btn.isRoyal){
                deactivateButtons();
                btn.isActive = !btn.isActive;
                btn.setButtonNotRoyal();
            }
        }else{
            btn.setButtonRoyal();
        }
    }

    private boolean isThereAnyRoyalBtn() {
        if (btn1.isRoyal) return true;
        if (btn2.isRoyal) return true;
        if (btn3.isRoyal) return true;
        if (btn4.isRoyal) return true;
        if (btn5.isRoyal) return true;
        if (btn6.isRoyal) return true;
        if (btn7.isRoyal) return true;
        if (btn8.isRoyal) return true;
        if (btn9.isRoyal) return true;
        if (btn10.isRoyal) return true;
        if (btn11.isRoyal) return true;
        if (btn12.isRoyal) return true;
        if (btn13.isRoyal) return true;
        if (btn14.isRoyal) return true;
        if (btn15.isRoyal) return true;
        if (btn16.isRoyal) return true;
        return false;
    }
    /*Aşağıda yazdığımız metodun amacı ise butonlarımızı başlatmak aynı zamanda her birini de
     istediğimiz şekilde özelleştirebilmeyi sağlamaktır*/
    private void initializeButtons() {
        String activeIconPath = "/active.png";
        String passiveIconPath = "/inactive.png";
        btn1 = new CustomButton(
                false,
                "Button 1",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn2 = new CustomButton(
                false,
                "Button 2",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn3 = new CustomButton(
                false,
                "Button 3",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn4 = new CustomButton(
                false,
                "Button 4",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn5 = new CustomButton(
                false,
                "Button 5",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn6 = new CustomButton(
                false,
                "Button 6",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn7 = new CustomButton(
                false,
                "Button 7",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn8 = new CustomButton(
                false,
                "Button 8",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn9 = new CustomButton(
                false,
                "Button 9",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn10 = new CustomButton(
                false,
                "Button 10",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn11 = new CustomButton(
                false,
                "Button 11",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn12 = new CustomButton(
                false,
                "Button 12",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn13 = new CustomButton(
                false,
                "Button 13",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn14 = new CustomButton(
                false,
                "Button 14",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn15 = new CustomButton(
                false,
                "Button 15",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
        btn16 = new CustomButton(
                false,
                "Button 16",
                "https://www.youtube.com/",
                Color.BLUE,
                Color.GRAY,
                activeIconPath,
                passiveIconPath
        );
    }
    //butonları deaktif durumuna getirmek için yazdığımız metot
    private void deactivateButtons(){
        btn1.deactivateButton();
        btn2.deactivateButton();
        btn3.deactivateButton();
        btn4.deactivateButton();
        btn5.deactivateButton();
        btn6.deactivateButton();
        btn7.deactivateButton();
        btn8.deactivateButton();
        btn9.deactivateButton();
        btn10.deactivateButton();
        btn11.deactivateButton();
        btn12.deactivateButton();
        btn13.deactivateButton();
        btn14.deactivateButton();
        btn15.deactivateButton();
        btn16.deactivateButton();
    }


}
