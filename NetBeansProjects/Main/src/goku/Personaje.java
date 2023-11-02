package goku;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Personaje extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        int factor=14;
        
        //CABELLO
        Path cabello=new Path();
		    		
            MoveTo startcabello=new MoveTo((7)*factor,(0)*factor);
            CubicCurveTo pel1=new CubicCurveTo();
            pel1.setControlX1(13*factor);
            pel1.setControlY1(0*factor);
            pel1.setControlX2(16*factor);
            pel1.setControlY2(4*factor);
            pel1.setX(17*factor);
            pel1.setY(7*factor);

            CubicCurveTo pel2=new CubicCurveTo();
            pel2.setControlX1(19*factor);
            pel2.setControlY1(6*factor);
            pel2.setControlX2(23*factor);
            pel2.setControlY2(9*factor);
            pel2.setX(22*factor);
            pel2.setY(12*factor);		    		

            CubicCurveTo pel3=new CubicCurveTo();
            pel3.setControlX1(22.5*factor);
            pel3.setControlY1(11.7*factor);
            pel3.setControlX2(27.5*factor);
            pel3.setControlY2(11*factor);
            pel3.setX(28*factor);
            pel3.setY(12.4*factor);

            CubicCurveTo pel4=new CubicCurveTo();
            pel4.setControlX1(28*factor);
            pel4.setControlY1(13*factor);
            pel4.setControlX2(23*factor);
            pel4.setControlY2(16.5*factor);
            pel4.setX(23*factor);
            pel4.setY(15*factor);                                

            CubicCurveTo pel5=new CubicCurveTo();
            pel5.setControlX1(23.3*factor);
            pel5.setControlY1(14.7*factor);
            pel5.setControlX2(27.5*factor);
            pel5.setControlY2(16.7*factor);
            pel5.setX(28*factor);
            pel5.setY(17*factor);

            CubicCurveTo pel6=new CubicCurveTo();
            pel6.setControlX1(27.5*factor);
            pel6.setControlY1(17.3*factor);
            pel6.setControlX2(23.4*factor);
            pel6.setControlY2(18.7*factor);
            pel6.setX(23*factor);
            pel6.setY(18.3*factor);     

            CubicCurveTo pel7=new CubicCurveTo();
            pel7.setControlX1(28*factor);
            pel7.setControlY1(20.5*factor);
            pel7.setControlX2(24*factor);
            pel7.setControlY2(21*factor);
            pel7.setX(20.3*factor);
            pel7.setY(20*factor);


            CubicCurveTo pel8=new CubicCurveTo();
            pel8.setControlX1(22*factor);
            pel8.setControlY1(19.5*factor);
            pel8.setControlX2(23*factor);
            pel8.setControlY2(17*factor);
            pel8.setX(21*factor);
            pel8.setY(16.3*factor); 

            CubicCurveTo pel9=new CubicCurveTo();
            pel9.setControlX1(19.7*factor);
            pel9.setControlY1(17.1*factor);
            pel9.setControlX2(19.4*factor);
            pel9.setControlY2(17.1*factor);
            pel9.setX(20.5*factor);
            pel9.setY(15*factor);   

            CubicCurveTo pel10=new CubicCurveTo();
            pel10.setControlX1(17.5*factor);
            pel10.setControlY1(17*factor);
            pel10.setControlX2(20.5*factor);
            pel10.setControlY2(15.5*factor);
            pel10.setX(19*factor);
            pel10.setY(13*factor);  

            CubicCurveTo pel11=new CubicCurveTo();
            pel11.setControlX1(17.5*factor);
            pel11.setControlY1(14*factor);
            pel11.setControlX2(18.5*factor);
            pel11.setControlY2(13.2*factor);
            pel11.setX(17.8*factor);
            pel11.setY(11.8*factor);  

            CubicCurveTo pel12=new CubicCurveTo();
            pel12.setControlX1(14*factor);
            pel12.setControlY1(12.2*factor);
            pel12.setControlX2(15*factor);
            pel12.setControlY2(16*factor);
            pel12.setX(14*factor);
            pel12.setY(11*factor);   

            CubicCurveTo pel13=new CubicCurveTo();
            pel13.setControlX1(12*factor);
            pel13.setControlY1(14*factor);
            pel13.setControlX2(12*factor);
            pel13.setControlY2(13.2*factor);
            pel13.setX(12*factor);
            pel13.setY(11.5*factor); 

            CubicCurveTo pel14=new CubicCurveTo();
            pel14.setControlX1(8*factor);
            pel14.setControlY1(14*factor);
            pel14.setControlX2(10.5*factor);
            pel14.setControlY2(17*factor);
            pel14.setX(9*factor);
            pel14.setY(15*factor);

            CubicCurveTo pel15=new CubicCurveTo();
            pel15.setControlX1(9.3*factor);
            pel15.setControlY1(16*factor);
            pel15.setControlX2(9.5*factor);
            pel15.setControlY2(16.5*factor);
            pel15.setX(10.3*factor);
            pel15.setY(17*factor);    

            LineTo line1 = new LineTo(10*factor, 17.4*factor);
            //startcabello=new MoveTo((10)*factor,(17.4)*factor);

            CubicCurveTo pel16=new CubicCurveTo();
            pel16.setControlX1(8.5*factor);
            pel16.setControlY1(16*factor);
            pel16.setControlX2(7.2*factor);
            pel16.setControlY2(17*factor);
            pel16.setX(8.5*factor);
            pel16.setY(19.5*factor);   

            CubicCurveTo pel17=new CubicCurveTo();
            pel17.setControlX1(4*factor);
            pel17.setControlY1(19.7*factor);
            pel17.setControlX2(5.5*factor);
            pel17.setControlY2(18.3*factor);
            pel17.setX(7*factor);
            pel17.setY(17*factor);

            CubicCurveTo pel18=new CubicCurveTo();
            pel18.setControlX1(0*factor);
            pel18.setControlY1(15*factor);
            pel18.setControlX2(3*factor);
            pel18.setControlY2(13.8*factor);
            pel18.setX(7*factor);
            pel18.setY(13.5*factor);       

            CubicCurveTo pel19=new CubicCurveTo();
            pel19.setControlX1(0*factor);
            pel19.setControlY1(12*factor);
            pel19.setControlX2(0*factor);
            pel19.setControlY2(8*factor);
            pel19.setX(10*factor);
            pel19.setY(7.5*factor);  

            LineTo line2 = new LineTo(7*factor, 0*factor);
                                
                    
        Path cabeza=new Path();
                               
                                
            MoveTo startcabeza =new MoveTo(8.5*factor,19.5*factor);
            CubicCurveTo orejaizq=new CubicCurveTo();
            orejaizq.setControlX1(8.5*factor);
            orejaizq.setControlY1(20.2*factor);
            orejaizq.setControlX2(10.5*factor);
            orejaizq.setControlY2(20.2*factor);
            orejaizq.setX(10.5*factor);
            orejaizq.setY(19.5*factor);                        

            CubicCurveTo mandibula =new CubicCurveTo();
            mandibula.setControlX1(11*factor);
            mandibula.setControlY1(23.3*factor);
            mandibula.setControlX2(18.5*factor);
            mandibula.setControlY2(23.3*factor);
            mandibula.setX(19.5*factor);
            mandibula.setY(19.5*factor);

            CubicCurveTo orejader =new CubicCurveTo();
            orejader.setControlX1(19.5*factor);
            orejader.setControlY1(20.2*factor);
            orejader.setControlX2(21*factor);
            orejader.setControlY2(20.2*factor);
            orejader.setX(21.2*factor);
            orejader.setY(19.5*factor);

            CubicCurveTo pel82=new CubicCurveTo();
            pel82.setControlX1(21.5*factor);
            pel82.setControlY1(19.5*factor);
            pel82.setControlX2(23*factor);
            pel82.setControlY2(17*factor);
            pel82.setX(21*factor);
            pel82.setY(16.3*factor); 

            CubicCurveTo pel92=new CubicCurveTo();
            pel92.setControlX1(19.7*factor);
            pel92.setControlY1(17.1*factor);
            pel92.setControlX2(19.4*factor);
            pel92.setControlY2(17.1*factor);
            pel92.setX(20.5*factor);
            pel92.setY(15*factor);   

            CubicCurveTo pel102=new CubicCurveTo();
            pel102.setControlX1(17.5*factor);
            pel102.setControlY1(17*factor);
            pel102.setControlX2(20.5*factor);
            pel102.setControlY2(15.5*factor);
            pel102.setX(19*factor);
            pel102.setY(13*factor);  

            CubicCurveTo pel112=new CubicCurveTo();
            pel112.setControlX1(17.5*factor);
            pel112.setControlY1(14*factor);
            pel112.setControlX2(18.5*factor);
            pel112.setControlY2(13.2*factor);
            pel112.setX(17.8*factor);
            pel112.setY(11.8*factor);  

            CubicCurveTo pel122=new CubicCurveTo();
            pel122.setControlX1(14*factor);
            pel122.setControlY1(12.2*factor);
            pel122.setControlX2(15*factor);
            pel122.setControlY2(16*factor);
            pel122.setX(14*factor);
            pel122.setY(11*factor);   

            CubicCurveTo pel132=new CubicCurveTo();
            pel132.setControlX1(12*factor);
            pel132.setControlY1(14*factor);
            pel132.setControlX2(12*factor);
            pel132.setControlY2(13.2*factor);
            pel132.setX(12*factor);
            pel132.setY(11.5*factor); 

            CubicCurveTo pel142=new CubicCurveTo();
            pel142.setControlX1(8*factor);
            pel142.setControlY1(14*factor);
            pel142.setControlX2(10.5*factor);
            pel142.setControlY2(17*factor);
            pel142.setX(9*factor);
            pel142.setY(15*factor);

            CubicCurveTo pel152=new CubicCurveTo();
            pel152.setControlX1(9.3*factor);
            pel152.setControlY1(16*factor);
            pel152.setControlX2(9.5*factor);
            pel152.setControlY2(16.5*factor);
            pel152.setX(10.3*factor);
            pel152.setY(17*factor);    

            LineTo line12 = new LineTo(10*factor, 17.4*factor);

            CubicCurveTo pel162=new CubicCurveTo();
            pel162.setControlX1(8.5*factor);
            pel162.setControlY1(16*factor);
            pel162.setControlX2(7.2*factor);
            pel162.setControlY2(17*factor);
            pel162.setX(8.5*factor);
            pel162.setY(19.5*factor);            
                    
    //OJOS               
    Path ojos=new Path();                
                    
        MoveTo startojoizq =new MoveTo(11.2*factor,18.6*factor);
        CubicCurveTo ojoizq=new CubicCurveTo();
        ojoizq.setControlX1(10.4*factor);
        ojoizq.setControlY1(15.7*factor);
        ojoizq.setControlX2(13.2*factor);
        ojoizq.setControlY2(15*factor);
        ojoizq.setX(14.3*factor);
        ojoizq.setY(18.5*factor);

        MoveTo startojoder =new MoveTo(15.9*factor,18.5*factor);
        CubicCurveTo ojoder =new CubicCurveTo();
        ojoder.setControlX1(15.6*factor);
        ojoder.setControlY1(15.3*factor);
        ojoder.setControlX2(18.5*factor);
        ojoder.setControlY2(15*factor);
        ojoder.setX(18.5*factor);
        ojoder.setY(18.3*factor);
                    
    //CEJAS Y CURVAS O RAYAS EN LA CARA                
    Path cejas=new Path();  
    
        MoveTo startcejaizq =new MoveTo(10.5*factor,15*factor);
        CubicCurveTo cejaizq=new CubicCurveTo();
        cejaizq.setControlX1(11.5*factor);
        cejaizq.setControlY1(14*factor);
        cejaizq.setControlX2(13.2*factor);
        cejaizq.setControlY2(15.8*factor);
        cejaizq.setX(13.2*factor);
        cejaizq.setY(16*factor);

        MoveTo startcejader =new MoveTo(16.2*factor,16*factor);
        CubicCurveTo cejader=new CubicCurveTo();
        cejader.setControlX1(16.5*factor);
        cejader.setControlY1(15*factor);
        cejader.setControlX2(18*factor);
        cejader.setControlY2(14*factor);
        cejader.setX(19*factor);
        cejader.setY(14.3*factor);

        MoveTo startcacheteizq =new MoveTo(11*factor,19*factor);
        CubicCurveTo cacheteizq =new CubicCurveTo();
        cacheteizq.setControlX1(11.1*factor);
        cacheteizq.setControlY1(18.4*factor);
        cacheteizq.setControlX2(12.7*factor);
        cacheteizq.setControlY2(18.7*factor);
        cacheteizq.setX(13.1*factor);
        cacheteizq.setY(19.1*factor);

        MoveTo startcacheteder =new MoveTo(16.4*factor,18.8*factor);
        CubicCurveTo cacheteder =new CubicCurveTo();
        cacheteder.setControlX1(16.5*factor);
        cacheteder.setControlY1(18.5*factor);
        cacheteder.setControlX2(18.4*factor);
        cacheteder.setControlY2(18.5*factor);
        cacheteder.setX(18.5*factor);
        cacheteder.setY(18.8*factor);

        MoveTo startli =new MoveTo(15.9*factor,18.5*factor);
        LineTo line3 = new LineTo(16.7*factor, 18.5*factor);

        MoveTo startnariz =new MoveTo(14.7*factor,19.3*factor);
        CubicCurveTo nariz =new CubicCurveTo();
        nariz.setControlX1(14.8*factor);
        nariz.setControlY1(18.9*factor);
        nariz.setControlX2(15.2*factor);
        nariz.setControlY2(18.9*factor);
        nariz.setX(15.3*factor);
        nariz.setY(19.3*factor); 

        MoveTo startboca =new MoveTo(13.5*factor,20*factor);
        CubicCurveTo boca =new CubicCurveTo();
        boca.setControlX1(13.8*factor);
        boca.setControlY1(20.8*factor);
        boca.setControlX2(17.2*factor);
        boca.setControlY2(20.6*factor);
        boca.setX(17*factor);
        boca.setY(19.3*factor); 

        MoveTo startli1 =new MoveTo(10.5*factor,19.5*factor);
        LineTo line4 = new LineTo(10*factor, 17.8*factor); 

        MoveTo startli2 =new MoveTo(19.5*factor,19.5*factor);
        LineTo line5 = new LineTo(20*factor, 17.9*factor);

        MoveTo startli3 =new MoveTo(14.8*factor,20.9*factor);
        LineTo line6 = new LineTo(15.5*factor, 20.8*factor);

        //oreiz,oreder
        MoveTo startoreiz =new MoveTo(9.1*factor,19.2*factor);
        CubicCurveTo oreiz =new CubicCurveTo();
        oreiz.setControlX1(8*factor);
        oreiz.setControlY1(18*factor);
        oreiz.setControlX2(9.2*factor);
        oreiz.setControlY2(16.8*factor);
        oreiz.setX(9.5*factor);
        oreiz.setY(17.8*factor); 

        MoveTo startoreder =new MoveTo(20.5*factor,19*factor);
        CubicCurveTo oreder =new CubicCurveTo();
        oreder.setControlX1(22*factor);
        oreder.setControlY1(18.6*factor);
        oreder.setControlX2(21*factor);
        oreder.setControlY2(16.3*factor);
        oreder.setX(20.4*factor);
        oreder.setY(17.2*factor); 
                    
                    
    //PUPILAS                
    Path pupilas = new Path(); 
    
        MoveTo startpupilaizq =new MoveTo(13.8*factor,18.5*factor);
        CubicCurveTo pupizq =new CubicCurveTo();
        pupizq.setControlX1(14.2*factor);
        pupizq.setControlY1(18.3*factor);
        pupizq.setControlX2(14*factor);
        pupizq.setControlY2(17.5*factor);
        pupizq.setX(13.6*factor);
        pupizq.setY(17.5*factor); 

        CubicCurveTo pupizq2 =new CubicCurveTo();
        pupizq2.setControlX1(13.4*factor);
        pupizq2.setControlY1(17.8*factor);
        pupizq2.setControlX2(13.4*factor);
        pupizq2.setControlY2(18.4*factor);
        pupizq2.setX(13.8*factor);
        pupizq2.setY(18.5*factor);     

        MoveTo startpupilader =new MoveTo(16.3*factor,18.5*factor);
        CubicCurveTo pupider =new CubicCurveTo();
        pupider.setControlX1(15.8*factor);
        pupider.setControlY1(18.2*factor);
        pupider.setControlX2(15.8*factor);
        pupider.setControlY2(17.7*factor);
        pupider.setX(16.3*factor);
        pupider.setY(17.4*factor); 

        CubicCurveTo pupider2 =new CubicCurveTo();
        pupider2.setControlX1(16.6*factor);
        pupider2.setControlY1(17.6*factor);
        pupider2.setControlX2(16.65*factor);
        pupider2.setControlY2(18.3*factor);
        pupider2.setX(16.3*factor);
        pupider2.setY(18.5*factor);                     
                    
    //CUELLO Y PECHO
    
    Path cuecho = new Path();
    
        MoveTo startcuello =new MoveTo(16.6*factor,22.2*factor);
        CubicCurveTo cue1 =new CubicCurveTo();
        cue1.setControlX1(16.5*factor);
        cue1.setControlY1(22.5*factor);
        cue1.setControlX2(17.7*factor);
        cue1.setControlY2(23.1*factor);
        cue1.setX(17.8*factor);
        cue1.setY(23.2*factor);  

        CubicCurveTo cue2 =new CubicCurveTo();
        cue2.setControlX1(18.2*factor);
        cue2.setControlY1(23.8*factor);
        cue2.setControlX2(14.8*factor);
        cue2.setControlY2(28.8*factor);
        cue2.setX(14.8*factor);
        cue2.setY(28.8*factor);

        CubicCurveTo cue3 =new CubicCurveTo();
        cue3.setControlX1(12*factor);
        cue3.setControlY1(28*factor);
        cue3.setControlX2(10.8*factor);
        cue3.setControlY2(25*factor);
        cue3.setX(11.5*factor);
        cue3.setY(23.3*factor);

        CubicCurveTo cue4 =new CubicCurveTo();
        cue4.setControlX1(12.3*factor);
        cue4.setControlY1(23.5*factor);
        cue4.setControlX2(14*factor);
        cue4.setControlY2(23*factor);
        cue4.setX(13.4*factor);
        cue4.setY(22.2*factor);

        CubicCurveTo cue5 =new CubicCurveTo();
        cue5.setControlX1(15*factor);
        cue5.setControlY1(22.4*factor);
        cue5.setControlX2(15*factor);
        cue5.setControlY2(22.4*factor);
        cue5.setX(16.6*factor);
        cue5.setY(22.2*factor);

        MoveTo startcue6 =new MoveTo(11.5*factor,23.4*factor);
        CubicCurveTo cue6 =new CubicCurveTo();
        cue6.setControlX1(13*factor);
        cue6.setControlY1(24*factor);
        cue6.setControlX2(14.8*factor);
        cue6.setControlY2(23.8*factor);
        cue6.setX(14.8*factor);
        cue6.setY(24.8*factor);    

        MoveTo startcue7 =new MoveTo(14.8*factor,24.8*factor);
        LineTo line7 = new LineTo(15.2*factor, 24.8*factor);

        MoveTo startcue8 =new MoveTo(15.2*factor,24.8*factor);
        CubicCurveTo cue7 =new CubicCurveTo();
        cue7.setControlX1(15.3*factor);
        cue7.setControlY1(24*factor);
        cue7.setControlX2(15.8*factor);
        cue7.setControlY2(24*factor);
        cue7.setX(17.8*factor);
        cue7.setY(23.4*factor);

        MoveTo startcue9 =new MoveTo(14*factor,22.7*factor);
        LineTo line8 = new LineTo(14.4*factor, 23.6*factor);

        MoveTo startcue10 =new MoveTo(15*factor,24*factor);
        LineTo line9 = new LineTo(15.2*factor, 23.7*factor);

        MoveTo startcue11 =new MoveTo(14.8*factor,25.8*factor);
        LineTo line10 = new LineTo(14.9*factor, 27.3*factor);

        MoveTo startcue12 =new MoveTo(14.7*factor,27.45*factor);
        LineTo line11 = new LineTo(14.8*factor, 28.2*factor);
                    
                    
    Path camisa = new Path();
                    
        MoveTo startcamisa =new MoveTo(17.6*factor,23.1*factor);
        CubicCurveTo cami1 =new CubicCurveTo();
        cami1.setControlX1(17.5*factor);
        cami1.setControlY1(22.5*factor);
        cami1.setControlX2(18.6*factor);
        cami1.setControlY2(23.3*factor);
        cami1.setX(17.8*factor);
        cami1.setY(23.2*factor);

        MoveTo startcamisa1 =new MoveTo(18*factor,23*factor);
        CubicCurveTo cami2 =new CubicCurveTo();
        cami2.setControlX1(18.1*factor);
        cami2.setControlY1(23*factor);
        cami2.setControlX2(21*factor);
        cami2.setControlY2(23*factor);
        cami2.setX(23.1*factor);
        cami2.setY(25*factor);

        CubicCurveTo cami3 =new CubicCurveTo();
        cami3.setControlX1(23*factor);
        cami3.setControlY1(25.7*factor);
        cami3.setControlX2(21.5*factor);
        cami3.setControlY2(27*factor);
        cami3.setX(21*factor);
        cami3.setY(28*factor);

        CubicCurveTo cami4 =new CubicCurveTo();
        cami4.setControlX1(22*factor);
        cami4.setControlY1(29*factor);
        cami4.setControlX2(21*factor);
        cami4.setControlY2(33*factor);
        cami4.setX(20*factor);
        cami4.setY(31.5*factor);


        CubicCurveTo cami5 =new CubicCurveTo();
        cami5.setControlX1(18*factor);
        cami5.setControlY1(30.8*factor);
        cami5.setControlX2(11.5*factor);
        cami5.setControlY2(30.8*factor);
        cami5.setX(9.5*factor);
        cami5.setY(31.5*factor);

        CubicCurveTo cami6 =new CubicCurveTo();
        cami6.setControlX1(8.7*factor);
        cami6.setControlY1(32.5*factor);
        cami6.setControlX2(8*factor);
        cami6.setControlY2(30*factor);
        cami6.setX(9*factor);
        cami6.setY(28*factor);

        CubicCurveTo cami7 =new CubicCurveTo();
        cami7.setControlX1(8.7*factor);
        cami7.setControlY1(28.3*factor);
        cami7.setControlX2(6.6*factor);
        cami7.setControlY2(26.5*factor);
        cami7.setX(6.8*factor);
        cami7.setY(25*factor);

        CubicCurveTo cami8 =new CubicCurveTo();
        cami8.setControlX1(9.5*factor);
        cami8.setControlY1(23*factor);
        cami8.setControlX2(10.1*factor);
        cami8.setControlY2(24*factor);
        cami8.setX(11.5*factor);
        cami8.setY(22.9*factor);

        CubicCurveTo cami9 =new CubicCurveTo();
        cami9.setControlX1(10.8*factor);
        cami9.setControlY1(25*factor);
        cami9.setControlX2(12*factor);
        cami9.setControlY2(28*factor);
        cami9.setX(14.8*factor);
        cami9.setY(28.8*factor);

        CubicCurveTo cami10 =new CubicCurveTo();
        cami10.setControlX1(14.8*factor);
        cami10.setControlY1(28.8*factor);
        cami10.setControlX2(18.2*factor);
        cami10.setControlY2(23.8*factor);
        cami10.setX(18*factor);
        cami10.setY(23*factor);

        MoveTo startcamisa2 =new MoveTo(11.5*factor,23.5*factor);
        CubicCurveTo cami11 =new CubicCurveTo();
        cami11.setControlX1(11.6*factor);
        cami11.setControlY1(22.35*factor);
        cami11.setControlX2(12.4*factor);
        cami11.setControlY2(22.8*factor);
        cami11.setX(12.5*factor);
        cami11.setY(23.1*factor);

        MoveTo startcam1sa3 =new MoveTo(21*factor,28*factor);
        LineTo line13 = new LineTo(20.5*factor, 26.3*factor);

        MoveTo startcam1sa4 =new MoveTo(19.1*factor,23.3*factor);
        LineTo line14 = new LineTo(16.8*factor, 28.2*factor);

        MoveTo startcam1sa5 =new MoveTo(16*factor,31*factor);
        LineTo line15 = new LineTo(17.8*factor, 29.3*factor);

        MoveTo startcam1sa6 =new MoveTo(14.8*factor,28.8*factor);
        LineTo line16 = new LineTo(13*factor, 30.7*factor);

        MoveTo startcam1sa7 =new MoveTo(14.2*factor,29.2*factor);
        LineTo line17 = new LineTo(12*factor, 28.8*factor);

        MoveTo startcam1sa8 =new MoveTo(9*factor,28*factor);
        LineTo line18 = new LineTo(9.3*factor, 26.1*factor);

        MoveTo startcam1sa9 =new MoveTo(10.2*factor,23.5*factor);
        LineTo line19 = new LineTo(11*factor, 25.1*factor);

        //
        MoveTo startpantalon21 =new MoveTo(20.4*factor,40.2*factor);
        CubicCurveTo curpan14 =new CubicCurveTo();
        curpan14.setControlX1(21.3*factor);
        curpan14.setControlY1(40.9*factor);     
        curpan14.setControlX2(21.7*factor);
        curpan14.setControlY2(44.3*factor);
        curpan14.setX(21.5*factor);
        curpan14.setY(44.7*factor);


        //CURVAS SOBRE PANTALON NARANJAS
        //
        MoveTo startpantalon23 =new MoveTo(7*factor,47.8*factor);
        CubicCurveTo curpan16 =new CubicCurveTo();
        curpan16.setControlX1(6*factor);
        curpan16.setControlY1(47.8*factor);     
        curpan16.setControlX2(5.4*factor);
        curpan16.setControlY2(47.1*factor);
        curpan16.setX(5.6*factor);
        curpan16.setY(46*factor);

        //
        MoveTo startpantalon19 =new MoveTo(23.5*factor,42.9*factor);
        CubicCurveTo curpan12 =new CubicCurveTo();
        curpan12.setControlX1(23.55*factor);
        curpan12.setControlY1(43.7*factor);     
        curpan12.setControlX2(23*factor);
        curpan12.setControlY2(45.5*factor);
        curpan12.setX(22.8*factor);
        curpan12.setY(46*factor);

        //
        MoveTo startpantalon22 =new MoveTo(9*factor,43.8*factor);
        CubicCurveTo curpan15 =new CubicCurveTo();
        curpan15.setControlX1(9.8*factor);
        curpan15.setControlY1(42.6*factor);     
        curpan15.setControlX2(12.5*factor);
        curpan15.setControlY2(42*factor);
        curpan15.setX(13.4*factor);
        curpan15.setY(40.5*factor);

        //
        MoveTo startpantalon24 =new MoveTo(7.4*factor,47.6*factor);
        CubicCurveTo curpan17 =new CubicCurveTo();
        curpan17.setControlX1(7.7*factor);
        curpan17.setControlY1(47.4*factor);     
        curpan17.setControlX2(8.7*factor);
        curpan17.setControlY2(46.8*factor);
        curpan17.setX(8.9*factor);
        curpan17.setY(46.5*factor);
                    
                    
                    
        //BRAZOS
    Path brazos = new Path();
        
        MoveTo startbraizq =new MoveTo(6.9*factor,25.9*factor);
        CubicCurveTo bra1 =new CubicCurveTo();
        bra1.setControlX1(6.5*factor);
        bra1.setControlY1(27.8*factor);
        bra1.setControlX2(4*factor);
        bra1.setControlY2(27.3*factor);
        bra1.setX(3.4*factor);
        bra1.setY(30*factor);

        CubicCurveTo bra2 =new CubicCurveTo();
        bra2.setControlX1(3*factor);
        bra2.setControlY1(31.1*factor);
        bra2.setControlX2(5*factor);
        bra2.setControlY2(33*factor);
        bra2.setX(5.5*factor);
        bra2.setY(33*factor);    

        CubicCurveTo bra3 =new CubicCurveTo();
        bra3.setControlX1(5.9*factor);
        bra3.setControlY1(32.8*factor);
        bra3.setControlX2(7.5*factor);
        bra3.setControlY2(31.3*factor);
        bra3.setX(7.4*factor);
        bra3.setY(31.3*factor);


        LineTo linebra4 = new LineTo(6.8*factor, 30.6*factor);

        CubicCurveTo bra5 =new CubicCurveTo();
        bra5.setControlX1(8*factor);
        bra5.setControlY1(29.5*factor);
        bra5.setControlX2(9*factor);
        bra5.setControlY2(28.3*factor);
        bra5.setX(9*factor);
        bra5.setY(28*factor);

        LineTo linebra5 = new LineTo(6.9*factor, 25.9*factor);


        MoveTo startbraizq1 =new MoveTo(6.8*factor,30.6*factor);
        CubicCurveTo bra6 =new CubicCurveTo();
        bra6.setControlX1(6*factor);
        bra6.setControlY1(30.6*factor);
        bra6.setControlX2(5.7*factor);
        bra6.setControlY2(28.7*factor);
        bra6.setX(4.1*factor);
        bra6.setY(30*factor);

        MoveTo startbraizq2 =new MoveTo(6.8*factor,29.5*factor);
        CubicCurveTo bra7 =new CubicCurveTo();
        bra7.setControlX1(6.9*factor);
        bra7.setControlY1(29.6*factor);
        bra7.setControlX2(8.1*factor);
        bra7.setControlY2(28.2*factor);
        bra7.setX(8*factor);
        bra7.setY(28*factor);

        MoveTo startbraizq3 =new MoveTo(4*factor,31*factor);
        CubicCurveTo bra8 =new CubicCurveTo();
        bra8.setControlX1(4.2*factor);
        bra8.setControlY1(31.3*factor);
        bra8.setControlX2(5.6*factor);
        bra8.setControlY2(33*factor);
        bra8.setX(5.9*factor);
        bra8.setY(32.7*factor);


        MoveTo startbrader =new MoveTo(22.6*factor,25.8*factor);
        CubicCurveTo bra12 =new CubicCurveTo();
        bra12.setControlX1(22.5*factor);
        bra12.setControlY1(27.8*factor);
        bra12.setControlX2(26*factor);
        bra12.setControlY2(27.3*factor);
        bra12.setX(26.5*factor);
        bra12.setY(30*factor);

        CubicCurveTo bra22 =new CubicCurveTo();
        bra22.setControlX1(27*factor);
        bra22.setControlY1(31.1*factor);
        bra22.setControlX2(25*factor);
        bra22.setControlY2(33*factor);
        bra22.setX(24*factor);
        bra22.setY(33*factor);    

        CubicCurveTo bra32 =new CubicCurveTo();
        bra32.setControlX1(23*factor);
        bra32.setControlY1(32.8*factor);
        bra32.setControlX2(21*factor);
        bra32.setControlY2(31.3*factor);
        bra32.setX(22.2*factor);
        bra32.setY(31.1*factor);

        LineTo linebra42 = new LineTo(23*factor, 30.6*factor);

        CubicCurveTo bra52 =new CubicCurveTo();
        bra52.setControlX1(21*factor);
        bra52.setControlY1(30.7*factor);
        bra52.setControlX2(21*factor);
        bra52.setControlY2(28.3*factor);
        bra52.setX(21*factor);
        bra52.setY(28*factor);

        CubicCurveTo bra62 =new CubicCurveTo();
        bra62.setControlX1(21.5*factor);
        bra62.setControlY1(27*factor);
        bra62.setControlX2(23*factor);
        bra62.setControlY2(25.7*factor);
        bra62.setX(22.6*factor);
        bra62.setY(25.8*factor);

        MoveTo startbrader1 =new MoveTo(23*factor,30.6*factor);
        CubicCurveTo bra63 =new CubicCurveTo();
        bra63.setControlX1(23*factor);
        bra63.setControlY1(30.6*factor);
        bra63.setControlX2(24*factor);
        bra63.setControlY2(28.7*factor);
        bra63.setX(26*factor);
        bra63.setY(30*factor);

        MoveTo startbrader2 =new MoveTo(22.7*factor,29.5*factor);
        CubicCurveTo bra72 =new CubicCurveTo();
        bra72.setControlX1(22.2*factor);
        bra72.setControlY1(29.6*factor);
        bra72.setControlX2(21.4*factor);
        bra72.setControlY2(28.2*factor);
        bra72.setX(21.7*factor);
        bra72.setY(28*factor);

        MoveTo startbrader3 =new MoveTo(23.7*factor,32.6*factor);
        LineTo bra82 = new LineTo(25*factor, 32*factor);
                    
    Path muñequeras = new Path();            
                    
        //MUÑEQUERA IZQUIERDA
        MoveTo startmuñeizq =new MoveTo(5.5*factor,33*factor);
        CubicCurveTo muñizq1 =new CubicCurveTo();
        muñizq1.setControlX1(5.5*factor);
        muñizq1.setControlY1(34*factor);
        muñizq1.setControlX2(8.1*factor);
        muñizq1.setControlY2(31*factor);
        muñizq1.setX(7.5*factor);
        muñizq1.setY(31*factor);

        LineTo linemuñ1 = new LineTo(5.5*factor, 33*factor);

        MoveTo startmuñeizq1 =new MoveTo(5.7*factor,33.2*factor);
        CubicCurveTo muñizq2 =new CubicCurveTo();
        muñizq2.setControlX1(6.1*factor);
        muñizq2.setControlY1(34.2*factor);
        muñizq2.setControlX2(7*factor);
        muñizq2.setControlY2(33.7*factor);
        muñizq2.setX(7.1*factor);
        muñizq2.setY(34.5*factor);


        CubicCurveTo muñizq3 =new CubicCurveTo();
        muñizq3.setControlX1(7.3*factor);
        muñizq3.setControlY1(34.3*factor);
        muñizq3.setControlX2(9.8*factor);
        muñizq3.setControlY2(32.2*factor);
        muñizq3.setX(7.8*factor);
        muñizq3.setY(31.1*factor);

        MoveTo startmuñeizq2 =new MoveTo(8.1*factor,31.3*factor);
        LineTo linemuñ2 = new LineTo(7.1*factor, 33*factor);

        MoveTo startmuñeizq3 =new MoveTo(8.3*factor,32.5*factor);
        LineTo linemuñ3 = new LineTo(7.6*factor, 33.7*factor);


        //MUÑEQUERA DERECHA
        MoveTo startmuñeder =new MoveTo(24*factor,33*factor);
        CubicCurveTo muñder1 =new CubicCurveTo();
        muñder1.setControlX1(24*factor);
        muñder1.setControlY1(34*factor);
        muñder1.setControlX2(22.7*factor);
        muñder1.setControlY2(31*factor);
        muñder1.setX(22.3*factor);
        muñder1.setY(31*factor);

        MoveTo startl1 =new MoveTo(22.8*factor,31*factor);
        LineTo linemuñ12 = new LineTo(24*factor, 33*factor);

        MoveTo startmuñeder1 =new MoveTo(24*factor,33.3*factor);
        CubicCurveTo muñder2 =new CubicCurveTo();
        muñder2.setControlX1(23.6*factor);
        muñder2.setControlY1(34.2*factor);
        muñder2.setControlX2(22.5*factor);
        muñder2.setControlY2(33.7*factor);
        muñder2.setX(22.5*factor);
        muñder2.setY(34.5*factor);


        CubicCurveTo muñder3 =new CubicCurveTo();
        muñder3.setControlX1(22.2*factor);
        muñder3.setControlY1(34.6*factor);
        muñder3.setControlX2(20*factor);
        muñder3.setControlY2(32.2*factor);
        muñder3.setX(22*factor);
        muñder3.setY(31*factor);

        MoveTo startmuñeder2 =new MoveTo(21.7*factor,31.3*factor);
        LineTo linemuñ22 = new LineTo(22.6*factor, 33*factor);

        MoveTo startmuñeder3 =new MoveTo(21.4*factor,32.5*factor);
        LineTo linemuñ32 = new LineTo(22.1*factor, 33.7*factor);
                    
                    //PUÑOS DE LA MANO
    Path puños = new Path();        
                    
        MoveTo startpuñoizq =new MoveTo(8.6*factor,31.9*factor);
        CubicCurveTo puñoizq =new CubicCurveTo();
        puñoizq.setControlX1(9*factor);
        puñoizq.setControlY1(32.1*factor);
        puñoizq.setControlX2(10*factor);
        puñoizq.setControlY2(31.8*factor);
        puñoizq.setX(10.2*factor);
        puñoizq.setY(32*factor);


        CubicCurveTo puñoizq1 =new CubicCurveTo();
        puñoizq1.setControlX1(11.1*factor);
        puñoizq1.setControlY1(33.1*factor);
        puñoizq1.setControlX2(9.6*factor);
        puñoizq1.setControlY2(33.2*factor);
        puñoizq1.setX(10.2*factor);
        puñoizq1.setY(34*factor);

        CubicCurveTo puñoizq2 =new CubicCurveTo();
        puñoizq2.setControlX1(9.8*factor);
        puñoizq2.setControlY1(34.2*factor);
        puñoizq2.setControlX2(10*factor);
        puñoizq2.setControlY2(35.5*factor);
        puñoizq2.setX(9*factor);
        puñoizq2.setY(35*factor);

        CubicCurveTo puñoizq3 =new CubicCurveTo();
        puñoizq3.setControlX1(9*factor);
        puñoizq3.setControlY1(35.1*factor);
        puñoizq3.setControlX2(6.2*factor);
        puñoizq3.setControlY2(35*factor);
        puñoizq3.setX(7.8*factor);
        puñoizq3.setY(34.2*factor);

        CubicCurveTo puñoizq4 =new CubicCurveTo();
        puñoizq4.setControlX1(7.6*factor);
        puñoizq4.setControlY1(34.1*factor);
        puñoizq4.setControlX2(9*factor);
        puñoizq4.setControlY2(32.3*factor);
        puñoizq4.setX(8.6*factor);
        puñoizq4.setY(31.9*factor);

        MoveTo startpuño1 =new MoveTo(9.9*factor,33*factor);
        LineTo linepuñ1 = new LineTo(10.2*factor, 33.2*factor);

        MoveTo startpuño2 =new MoveTo(9.5*factor,34*factor);
        LineTo linepuñ2 = new LineTo(9.8*factor, 34.3*factor);

    ///PUÑO DERECHO    

        MoveTo startpuñoder =new MoveTo(21.1*factor,32*factor);
        CubicCurveTo puñoder =new CubicCurveTo();
        puñoder.setControlX1(21*factor);
        puñoder.setControlY1(32.1*factor);
        puñoder.setControlX2(20.9*factor);
        puñoder.setControlY2(31.8*factor);
        puñoder.setX(20.8*factor);
        puñoder.setY(32*factor);

        CubicCurveTo puñoder1 =new CubicCurveTo();
        puñoder1.setControlX1(18.6*factor);
        puñoder1.setControlY1(33.1*factor);
        puñoder1.setControlX2(20*factor);
        puñoder1.setControlY2(33.2*factor);
        puñoder1.setX(19.5*factor);
        puñoder1.setY(34.2*factor);

        CubicCurveTo puñoder2 =new CubicCurveTo();
        puñoder2.setControlX1(20*factor);
        puñoder2.setControlY1(34.2*factor);
        puñoder2.setControlX2(21*factor);
        puñoder2.setControlY2(35.5*factor);
        puñoder2.setX(21*factor);
        puñoder2.setY(34.8*factor);

        CubicCurveTo puñoder3 =new CubicCurveTo();
        puñoder3.setControlX1(21*factor);
        puñoder3.setControlY1(34.7*factor);
        puñoder3.setControlX2(23.6*factor);
        puñoder3.setControlY2(34.6*factor);
        puñoder3.setX(21.7*factor);
        puñoder3.setY(34.1*factor);

        CubicCurveTo puñoder4 =new CubicCurveTo();
        puñoder4.setControlX1(22*factor);
        puñoder4.setControlY1(33.5*factor);
        puñoder4.setControlX2(21*factor);
        puñoder4.setControlY2(32.5*factor);
        puñoder4.setX(21.1*factor);
        puñoder4.setY(32*factor);

        MoveTo startpuño12 =new MoveTo(20.1*factor,33*factor);
        LineTo linepuñ12 = new LineTo(19.6*factor, 33.2*factor);

        MoveTo startpuño22 =new MoveTo(20.2*factor,34*factor);
        LineTo linepuñ22 = new LineTo(19.9*factor, 34.3*factor);
                    
        //CINTURON 
    Path cinturon = new Path(); 
        
        MoveTo startcinturonizq =new MoveTo(9.3*factor,31.7*factor);
        CubicCurveTo cinizq1 =new CubicCurveTo();
        cinizq1.setControlX1(9.3*factor);
        cinizq1.setControlY1(31.4*factor);
        cinizq1.setControlX2(12*factor);
        cinizq1.setControlY2(30.9*factor);
        cinizq1.setX(14*factor);
        cinizq1.setY(31*factor);

        LineTo linecin1 = new LineTo(13.9*factor, 32.1*factor);

        CubicCurveTo cinizq2 =new CubicCurveTo();
        cinizq2.setControlX1(13.3*factor);
        cinizq2.setControlY1(32*factor);
        cinizq2.setControlX2(10.6*factor);
        cinizq2.setControlY2(32.1*factor);
        cinizq2.setX(10.5*factor);
        cinizq2.setY(32.6*factor);

        CubicCurveTo cinizq3 =new CubicCurveTo();
        cinizq3.setControlX1(10.5*factor);
        cinizq3.setControlY1(32.1*factor);
        cinizq3.setControlX2(9.6*factor);
        cinizq3.setControlY2(32*factor);
        cinizq3.setX(9.3*factor);
        cinizq3.setY(31.7*factor);

        MoveTo startcin2 =new MoveTo(14*factor,31.2*factor);
        LineTo linecin2 = new LineTo(13.5*factor, 31.3*factor);

        MoveTo startcin3 =new MoveTo(11*factor,32*factor);
        CubicCurveTo cinizq4 =new CubicCurveTo();
        cinizq4.setControlX1(11.2*factor);
        cinizq4.setControlY1(31.7*factor);
        cinizq4.setControlX2(13.5*factor);
        cinizq4.setControlY2(31.7*factor);
        cinizq4.setX(13.9*factor);
        cinizq4.setY(31.7*factor);

        MoveTo startcin4 =new MoveTo(14*factor,31.8*factor);
        LineTo linecin3 = new LineTo(13.4*factor, 31.9*factor);

        //CINTURON LADO DERECHO

        MoveTo startcinturonder =new MoveTo(20.63*factor,31.9*factor);
        CubicCurveTo cinder1 =new CubicCurveTo();
        cinder1.setControlX1(20.3*factor);
        cinder1.setControlY1(31.4*factor);
        cinder1.setControlX2(16*factor);
        cinder1.setControlY2(30.9*factor);
        cinder1.setX(15.8*factor);
        cinder1.setY(31*factor);

        LineTo linecin12 = new LineTo(15.9*factor, 32.2*factor);

        CubicCurveTo cinder2 =new CubicCurveTo();
        cinder2.setControlX1(16.2*factor);
        cinder2.setControlY1(32*factor);
        cinder2.setControlX2(19.5*factor);
        cinder2.setControlY2(32*factor);
        cinder2.setX(19.5*factor);
        cinder2.setY(32.8*factor);

        CubicCurveTo cinder3 =new CubicCurveTo();
        cinder3.setControlX1(19.6*factor);
        cinder3.setControlY1(32.6*factor);
        cinder3.setControlX2(20.3*factor);
        cinder3.setControlY2(32.3*factor);
        cinder3.setX(20.63*factor);
        cinder3.setY(31.9*factor);

        MoveTo startcin22 =new MoveTo(15.9*factor,31.7*factor);
        LineTo linecin22 = new LineTo(16.8*factor, 31.8*factor);

        MoveTo startcin32 =new MoveTo(15.83*factor,31.5*factor);
        CubicCurveTo cinder4 =new CubicCurveTo();
        cinder4.setControlX1(15.8*factor);
        cinder4.setControlY1(31.4*factor);
        cinder4.setControlX2(18.8*factor);
        cinder4.setControlY2(31.3*factor);
        cinder4.setX(19.1*factor);
        cinder4.setY(31.4*factor);

        LineTo linecin23 = new LineTo(15.83*factor, 31.5*factor);

        //NUDO DEL CINTURON 

        MoveTo startnudo =new MoveTo(14*factor,31*factor);
        CubicCurveTo nudo1 =new CubicCurveTo();
        nudo1.setControlX1(14.3*factor);
        nudo1.setControlY1(30.3*factor);
        nudo1.setControlX2(15.5*factor);
        nudo1.setControlY2(31*factor);
        nudo1.setX(15.2*factor);
        nudo1.setY(32.1*factor);

        MoveTo startnudo1 =new MoveTo(14*factor,31*factor);
        CubicCurveTo nudo2 =new CubicCurveTo();
        nudo2.setControlX1(14*factor);
        nudo2.setControlY1(33.5*factor);
        nudo2.setControlX2(15*factor);
        nudo2.setControlY2(33*factor);
        nudo2.setX(15*factor);
        nudo2.setY(31.9*factor);

        MoveTo startnudo2 =new MoveTo(15*factor,31*factor);
        CubicCurveTo nudo3 =new CubicCurveTo();
        nudo3.setControlX1(16.4*factor);
        nudo3.setControlY1(30.8*factor);     
        nudo3.setControlX2(16*factor);
        nudo3.setControlY2(32.7*factor);
        nudo3.setX(15*factor);
        nudo3.setY(32.57*factor);

//TIRAS DEL NUDO

    //TIRA IZQUIERDA
        MoveTo starttiraizq =new MoveTo(13.4*factor,32*factor);
        CubicCurveTo tira1 =new CubicCurveTo();
        tira1.setControlX1(13*factor);
        tira1.setControlY1(35*factor);     
        tira1.setControlX2(10.5*factor);
        tira1.setControlY2(36.5*factor);
        tira1.setX(11.3*factor);
        tira1.setY(41*factor);

        CubicCurveTo tira2 =new CubicCurveTo();
        tira2.setControlX1(12.6*factor);
        tira2.setControlY1(39.2*factor);     
        tira2.setControlX2(13.7*factor);
        tira2.setControlY2(40.6*factor);
        tira2.setX(14.1*factor);
        tira2.setY(40*factor);

        CubicCurveTo tira3 =new CubicCurveTo();
        tira3.setControlX1(14.4*factor);
        tira3.setControlY1(37.5*factor);     
        tira3.setControlX2(14.2*factor);
        tira3.setControlY2(34*factor);
        tira3.setX(14*factor);
        tira3.setY(32*factor);

        MoveTo starttiraizq1 =new MoveTo(14*factor,32*factor);
        CubicCurveTo tira4 =new CubicCurveTo();
        tira4.setControlX1(13.6*factor);
        tira4.setControlY1(35*factor);     
        tira4.setControlX2(12*factor);
        tira4.setControlY2(36.3*factor);
        tira4.setX(12.5*factor);
        tira4.setY(38.1*factor);

        MoveTo starttiraizq2 =new MoveTo(13*factor,36*factor);
        CubicCurveTo tira5 =new CubicCurveTo();
        tira5.setControlX1(13*factor);
        tira5.setControlY1(38*factor);     
        tira5.setControlX2(12.7*factor);
        tira5.setControlY2(38.7*factor);
        tira5.setX(13.3*factor);
        tira5.setY(39.2*factor);

//TIRA DERECHA

        MoveTo starttirader =new MoveTo(15.2*factor,32.6*factor);
        CubicCurveTo tira12 =new CubicCurveTo();
        tira12.setControlX1(17.1*factor);
        tira12.setControlY1(35.2*factor);     
        tira12.setControlX2(15*factor);
        tira12.setControlY2(39*factor);
        tira12.setX(16.3*factor);
        tira12.setY(40.2*factor);

        CubicCurveTo tira22 =new CubicCurveTo();
        tira22.setControlX1(16.7*factor);
        tira22.setControlY1(39.4*factor);     
        tira22.setControlX2(18.1*factor);
        tira22.setControlY2(40.6*factor);
        tira22.setX(18.4*factor);
        tira22.setY(39.7*factor);

        CubicCurveTo tira32 =new CubicCurveTo();
        tira32.setControlX1(16.7*factor);
        tira32.setControlY1(38.5*factor);     
        tira32.setControlX2(17.3*factor);
        tira32.setControlY2(34*factor);
        tira32.setX(16.1*factor);
        tira32.setY(32.1*factor);

        LineTo tira33 = new LineTo(15.5*factor, 32.1*factor);

        LineTo tira39 = new LineTo(15.2*factor, 32.6*factor);

        MoveTo starttirader1 =new MoveTo(15.6*factor,32.4*factor);
        CubicCurveTo tira42 =new CubicCurveTo();
        tira42.setControlX1(16*factor);
        tira42.setControlY1(34*factor);     
        tira42.setControlX2(16.4*factor);
        tira42.setControlY2(34.4*factor);
        tira42.setX(16.7*factor);
        tira42.setY(37*factor);

        LineTo linetir9 = new LineTo(15.6*factor, 32.4*factor);

        MoveTo starttirader2 =new MoveTo(16.3*factor,38*factor);
        LineTo linetir2 = new LineTo(16.4*factor, 39.3*factor);


        MoveTo starttirader3 =new MoveTo(16.8*factor,37.5*factor);
        LineTo linetir3 = new LineTo(17.1*factor, 39*factor);
                                    
        //PANTALON
    Path pantalon = new Path();
        
        MoveTo startpantalon =new MoveTo(8*factor,35*factor);
        LineTo linepan1 = new LineTo(7.5*factor, 35.4*factor);

        LineTo linepan2 = new LineTo(7.8*factor, 38*factor);

        CubicCurveTo curpan1 =new CubicCurveTo();
        curpan1.setControlX1(5*factor);
        curpan1.setControlY1(39*factor);     
        curpan1.setControlX2(5.8*factor);
        curpan1.setControlY2(44.1*factor);
        curpan1.setX(4.8*factor);
        curpan1.setY(45*factor);

        CubicCurveTo curpan2 =new CubicCurveTo();
        curpan2.setControlX1(4.8*factor);
        curpan2.setControlY1(45.6*factor);     
        curpan2.setControlX2(5*factor);
        curpan2.setControlY2(47.6*factor);
        curpan2.setX(6*factor);
        curpan2.setY(48*factor);

        CubicCurveTo curpan3 =new CubicCurveTo();
        curpan3.setControlX1(7.8*factor);
        curpan3.setControlY1(49.1*factor);     
        curpan3.setControlX2(9.5*factor);
        curpan3.setControlY2(47.2*factor);
        curpan3.setX(10.3*factor);
        curpan3.setY(47*factor);

        CubicCurveTo curpan4 =new CubicCurveTo();
        curpan4.setControlX1(11.2*factor);
        curpan4.setControlY1(46.8*factor);     
        curpan4.setControlX2(11*factor);
        curpan4.setControlY2(44.5*factor);
        curpan4.setX(12*factor);
        curpan4.setY(43*factor);

        LineTo linepan3 = new LineTo(11.8*factor, 42.8*factor);

        LineTo linepan4 = new LineTo(12.4*factor, 43*factor);

        CubicCurveTo curpan5 =new CubicCurveTo();
        curpan5.setControlX1(13.3*factor);
        curpan5.setControlY1(39*factor);     
        curpan5.setControlX2(17*factor);
        curpan5.setControlY2(39.4*factor);
        curpan5.setX(17.4*factor);
        curpan5.setY(44*factor);

        LineTo linepan5 = new LineTo(18.1*factor, 44.3*factor);

        CubicCurveTo curpan6 =new CubicCurveTo();
        curpan6.setControlX1(18*factor);
        curpan6.setControlY1(45.8*factor);     
        curpan6.setControlX2(18.1*factor);
        curpan6.setControlY2(46.6*factor);
        curpan6.setX(20*factor);
        curpan6.setY(47.5*factor);

        CubicCurveTo curpan7 =new CubicCurveTo();
        curpan7.setControlX1(21*factor);
        curpan7.setControlY1(49.4*factor);     
        curpan7.setControlX2(25*factor);
        curpan7.setControlY2(47*factor);
        curpan7.setX(23.5*factor);
        curpan7.setY(43*factor);

        CubicCurveTo curpan8 =new CubicCurveTo();
        curpan8.setControlX1(24.5*factor);
        curpan8.setControlY1(42.7*factor);     
        curpan8.setControlX2(22.4*factor);
        curpan8.setControlY2(38*factor);
        curpan8.setX(21.5*factor);
        curpan8.setY(37.5*factor);

        CubicCurveTo curpan9 =new CubicCurveTo();
        curpan9.setControlX1(23.5*factor);
        curpan9.setControlY1(37.4*factor);     
        curpan9.setControlX2(20.9*factor);
        curpan9.setControlY2(36.4*factor);
        curpan9.setX(21*factor);
        curpan9.setY(35*factor);

        LineTo linepan6 = new LineTo(19.3*factor, 32.5*factor);

        CubicCurveTo curpan10 =new CubicCurveTo();
        curpan10.setControlX1(18*factor);
        curpan10.setControlY1(31.8*factor);     
        curpan10.setControlX2(12.5*factor);
        curpan10.setControlY2(31.9*factor);
        curpan10.setX(10.4*factor);
        curpan10.setY(32.5*factor);

        LineTo linepan7 = new LineTo(8*factor, 35*factor);

        MoveTo startpantalon1 =new MoveTo(12*factor,32.3*factor);
        LineTo linepan8 = new LineTo(11.4*factor, 36*factor);

        MoveTo startpantalon121 =new MoveTo(11.4*factor,36*factor);
        LineTo linepan9 = new LineTo(11*factor, 34.2*factor);

        MoveTo startpantalon2 =new MoveTo(10*factor,34.4*factor);
        LineTo linepan10= new LineTo(11*factor, 35.2*factor);

        MoveTo startpantalon3 =new MoveTo(9.8*factor,35.2*factor);
        LineTo linepan11= new LineTo(10.6*factor, 35.9*factor);

        MoveTo startpantalon4 =new MoveTo(10.2*factor,34*factor);
        LineTo linepan12= new LineTo(11*factor, 33.9*factor);

        MoveTo startpantalon5 =new MoveTo(8.3*factor,37.5*factor);
        LineTo linepan13= new LineTo(9.5*factor, 39.6*factor);

        MoveTo startpantalon6 =new MoveTo(18*factor,32.4*factor);
        LineTo linepan14= new LineTo(18.2*factor, 35*factor);

        MoveTo startpantalon7 =new MoveTo(18.8*factor,35.7*factor);
        LineTo linepan15= new LineTo(19.4*factor, 33.5*factor);

        MoveTo startpantalon721 =new MoveTo(19.4*factor,33.5*factor);
        LineTo linepan16= new LineTo(20*factor, 36.3*factor);

        MoveTo startpantalon8 =new MoveTo(20.8*factor,35.3*factor);
        LineTo linepan17= new LineTo(20.4*factor, 36*factor);   

        MoveTo startpantalon9 =new MoveTo(21*factor,35.7*factor);
        LineTo linepan18= new LineTo(20.2*factor, 37.2*factor);              

        MoveTo startpantalon11 =new MoveTo(17.5*factor,44.1*factor);
        LineTo linepan20= new LineTo(19.2*factor, 44.3*factor);

        MoveTo startpantalon12 =new MoveTo(19.3*factor,43*factor);
        LineTo linepan21= new LineTo(20*factor, 44.1*factor);

        MoveTo startpantalon13 =new MoveTo(19.7*factor,44.8*factor);
        LineTo linepan22= new LineTo(21.1*factor, 47.3*factor);

        MoveTo startpantalon14 =new MoveTo(11.8*factor,43*factor);
        LineTo linepan23= new LineTo(11*factor, 43.4*factor);

        MoveTo startpantalon15 =new MoveTo(10*factor,45*factor);
        LineTo linepan24= new LineTo(7.9*factor, 46.7*factor);

        MoveTo startpantalon16 =new MoveTo(14.7*factor,40.2*factor);
        LineTo linepan25= new LineTo(14.9*factor, 39.7*factor);

        MoveTo startpantalon17 =new MoveTo(14.9*factor,40.2*factor);
        LineTo linepan26= new LineTo(15.4*factor, 38.8*factor);

        MoveTo startpantalon18 =new MoveTo(21.5*factor,36.4*factor);
        CubicCurveTo curpan11 =new CubicCurveTo();
        curpan11.setControlX1(21.6*factor);
        curpan11.setControlY1(38*factor);     
        curpan11.setControlX2(21*factor);
        curpan11.setControlY2(38.7*factor);
        curpan11.setX(21.2*factor);
        curpan11.setY(39*factor);

        MoveTo startpantalon20 =new MoveTo(21.8*factor,47.6*factor);
        CubicCurveTo curpan13 =new CubicCurveTo();
        curpan13.setControlX1(22.2*factor);
        curpan13.setControlY1(47*factor);     
        curpan13.setControlX2(23.2*factor);
        curpan13.setControlY2(46.2*factor);
        curpan13.setX(23*factor);
        curpan13.setY(46*factor);
                    
        //TOBILLERAS
        Path tobilleras = new Path();
        
            MoveTo starttobizq =new MoveTo(6*factor,48*factor);
            CubicCurveTo tobizq1 =new CubicCurveTo();
            tobizq1.setControlX1(6*factor);
            tobizq1.setControlY1(49.3*factor);     
            tobizq1.setControlX2(9.4*factor);
            tobizq1.setControlY2(49.3*factor);
            tobizq1.setX(9.5*factor);
            tobizq1.setY(47.57*factor);

            MoveTo starttobder =new MoveTo(20.1*factor,47.9*factor);
            CubicCurveTo tobder1 =new CubicCurveTo();
            tobder1.setControlX1(20.1*factor);
            tobder1.setControlY1(49.3*factor);     
            tobder1.setControlX2(24*factor);
            tobder1.setControlY2(48.8*factor);
            tobder1.setX(23.1*factor);
            tobder1.setY(47.3*factor);
                                     
        //MEDIAS
    Path medias = new Path();
        
        MoveTo startmedizq =new MoveTo(6*factor,48.6*factor);
        LineTo linemedizq1= new LineTo(4.5*factor, 50*factor);

        LineTo linemedizq2= new LineTo(6.5*factor, 50.9*factor);

        LineTo linemedizq3= new LineTo(9.5*factor, 50*factor);

        LineTo linemedizq4= new LineTo(9.5*factor, 47.57*factor);

        MoveTo startmedder =new MoveTo(23.1*factor,47.8*factor);
        LineTo linemedder1= new LineTo(24.42*factor, 49.*factor);

        LineTo linemedder2= new LineTo(22.52*factor, 50.2*factor);

        LineTo linemedder3= new LineTo(20.2*factor, 49.5*factor);

        LineTo linemedder4= new LineTo(20.2*factor, 48.3*factor);   
                                    
        //ZAPATOS
    Path zapatos = new Path();
        
        MoveTo startzapizq =new MoveTo(4.5*factor,50*factor);
        CubicCurveTo zapizq1 =new CubicCurveTo();
        zapizq1.setControlX1(0.6*factor);
        zapizq1.setControlY1(51.5*factor);     
        zapizq1.setControlX2(3.2*factor);
        zapizq1.setControlY2(54.3*factor);
        zapizq1.setX(7*factor);
        zapizq1.setY(52.2*factor);

        CubicCurveTo zapizq2 =new CubicCurveTo();
        zapizq2.setControlX1(7.4*factor);
        zapizq2.setControlY1(52*factor);     
        zapizq2.setControlX2(9*factor);
        zapizq2.setControlY2(51.3*factor);
        zapizq2.setX(9.5*factor);
        zapizq2.setY(51.3*factor);

        LineTo zapizq3= new LineTo(9.5*factor, 50*factor);

        MoveTo startzapder2 =new MoveTo(24.42*factor,49*factor);
        CubicCurveTo zapder2 =new CubicCurveTo();
        zapder2.setControlX1(27.6*factor);
        zapder2.setControlY1(50*factor);     
        zapder2.setControlX2(27.3*factor);
        zapder2.setControlY2(52.3*factor);
        zapder2.setX(22.5*factor);
        zapder2.setY(51.5*factor);

        CubicCurveTo zapder1 =new CubicCurveTo();
        zapder1.setControlX1(22.2*factor);
        zapder1.setControlY1(51.4*factor);     
        zapder1.setControlX2(21*factor);
        zapder1.setControlY2(50.8*factor);
        zapder1.setX(20.2*factor);
        zapder1.setY(50.7*factor);

        LineTo zapder3= new LineTo(20.2*factor, 48.3*factor);
                    
        //PARTES Y COLORES
                                
            cabello.getElements().addAll(startcabello,pel1,pel2,pel3,pel4,pel5,pel6
            ,pel7,pel8,pel9,pel10,pel11,pel12,pel13,pel14,pel15
            ,line1,pel16,pel17,pel18,pel19,line2);

            cabello.setFill(Color.BLACK);

            cabeza.getElements().addAll(startcabeza,orejaizq,mandibula,orejader,pel82,pel92,pel102,pel112,pel122,pel132,pel142,pel152
            ,line12,pel162);

            cabeza.setFill(Color.PINK);                 

            ojos.getElements().addAll(startojoizq,ojoizq,startojoder,ojoder);

            ojos.setFill(Color.WHITE);						    		 

            cejas.getElements().addAll(startcejaizq,cejaizq,startcejader
            ,cejader,startcacheteizq,cacheteizq,startcacheteder
            ,cacheteder,startli,line3,startnariz,nariz,startboca,boca
            ,startli1,line4,startli2,line5,startli3,line6,startoreiz,oreiz,startoreder,oreder);

            pupilas.getElements().addAll(startpupilaizq,pupizq,pupizq2
            ,startpupilader,pupider,pupider2);

            pupilas.setFill(Color.BLACK);

            cuecho.getElements().addAll(startcuello,cue1,cue2,cue3,cue4,
                    cue5,startcue6,cue6,startcue7,line7,startcue8,cue7,
                    startcue9,line8,startcue10,line9,startcue11,line10,startcue12,line11);
            cuecho.setFill(Color.PINK); 

            camisa.getElements().addAll(startcamisa,cami1,startcamisa1,cami2
                    ,cami3,cami4,cami5,cami6,cami7,cami8,cami9,cami10
            ,startcamisa2,cami11,startcam1sa3,line13,startcam1sa4,line14,startcam1sa5,line15,
            startcam1sa6,line16,startcam1sa7,line17,startcam1sa8,line18,startcam1sa9,line19,startpantalon21,curpan14,startpantalon23,curpan16,startpantalon19,curpan12,startpantalon22,curpan15,startpantalon24,curpan17);
            camisa.setFill(Color.ORANGE);

            brazos.getElements().addAll(startbraizq,bra1,bra2,bra3,linebra4,bra5
            ,linebra5,startbraizq1,bra6,startbraizq2,bra7,startbraizq3,bra8
            ,startbrader,bra12,bra22,bra32,linebra42,bra52,bra62,startbrader1,
            bra63,startbrader2,bra72,startbrader3,bra82);
            brazos.setFill(Color.PINK);

            muñequeras.getElements().addAll(startmuñeizq,muñizq1,linemuñ1
            ,startmuñeizq1,muñizq2,muñizq3,startmuñeizq2,linemuñ2,startmuñeizq3,linemuñ3,
            startmuñeder,muñder1,startl1,linemuñ12
            ,startmuñeder1,muñder2,muñder3,startmuñeder2,linemuñ22,startmuñeder3,linemuñ32);
            muñequeras.setFill(Color.BLUE);

            puños.getElements().addAll(startpuñoizq,puñoizq,puñoizq1,puñoizq2,
                    puñoizq3,puñoizq4,startpuño1,linepuñ1,startpuño2,linepuñ2,
                    startpuñoder,puñoder,puñoder1,puñoder2,
                    puñoder3,puñoder4,startpuño12,linepuñ12,startpuño22,linepuñ22);
            puños.setFill(Color.PINK);

            pantalon.getElements().addAll(startpantalon,linepan1,linepan2,curpan1,curpan2,curpan3,curpan4,
                    linepan3,linepan4,curpan5,linepan5,curpan6,curpan7,curpan8,curpan9,linepan6,curpan10,linepan7,startpantalon1,linepan8,startpantalon121,linepan9,
                    startpantalon2,linepan10,startpantalon3,linepan11,startpantalon4,linepan12,startpantalon5,linepan13,startpantalon6,linepan14,
                    startpantalon7,linepan15,startpantalon721,linepan16,startpantalon8,linepan17,startpantalon9,linepan18,startpantalon11,linepan20,
                    startpantalon12,linepan21,startpantalon13,linepan22,startpantalon14,linepan23,startpantalon15,linepan24,startpantalon16,linepan25,startpantalon17,linepan26,
                    startpantalon18,curpan11,startpantalon20,curpan13);

            pantalon.setFill(Color.ORANGE);

            cinturon.getElements().addAll(startcinturonizq,cinizq1,linecin1,cinizq2,cinizq3,startcin2,linecin2,startcin3,cinizq4,
                    startcin4,linecin3,startcinturonder,cinder1,linecin12,cinder2,cinder3,startcin22,linecin22,startcin32,cinder4,linecin23
                ,startnudo,nudo1,startnudo1,nudo2,startnudo2,nudo3,
                starttiraizq,tira1,tira2,tira3,starttiraizq1,tira4,starttiraizq2,tira5
            ,starttirader,tira12,tira22,tira32,tira33,tira39,starttirader1,tira42,linetir9,starttirader2,linetir2,starttirader3,linetir3);
            cinturon.setFill(Color.BLACK);

            tobilleras.getElements().addAll(starttobizq,tobizq1,starttobder,tobder1);

            tobilleras.setFill(Color.BLACK);

            medias.getElements().addAll(startmedizq,linemedizq1,linemedizq2,linemedizq3,linemedizq4,
            startmedder,linemedder1,linemedder2,linemedder3,linemedder4);

            medias.setFill(Color.WHITE);
            zapatos.getElements().addAll(startzapizq,zapizq1,zapizq2,zapizq3,startzapder2,zapder2,zapder1,zapder3);
            zapatos.setFill(Color.BLUE);
                    
            
                    
        //_____________________________________________________________
        
        Text text1=new Text(40, 600, "JEAN CARLOS HERNANDEZ BENAVIDES");
        Text textx=new Text(40, 620, "Código = 217034199");									    			
	text1.setFont(Font.font("Outwrite",FontWeight.BOLD,13));
	 
	 
	Pane root=new Pane();
        
	root.getChildren().addAll(cabello,cabeza,cejas,ojos,pupilas,cuecho,
                brazos,muñequeras,zapatos,medias,tobilleras,pantalon,cinturon,puños,camisa,text1,textx);
	
        
	
	Scene scena=new Scene(root, 800, 800);
	
	primaryStage.setTitle("GOKÚ programacion 3");
	primaryStage.setScene(scena);
	
	
	primaryStage.show();
        
   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}