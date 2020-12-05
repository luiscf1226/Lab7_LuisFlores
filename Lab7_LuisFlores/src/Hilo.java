
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luis Carlos Flores
 */
public class Hilo extends Thread {

    private JProgressBar progBar;
    private JProgressBar progBar2;
    private boolean avanzar;
    private Compilador e;
    private JTable tabla1;
    private double f;

    public Hilo(JProgressBar progBar, JProgressBar progBar2, JTable tabla1) {
        this.progBar = progBar;
        this.progBar2 = progBar2;
        this.tabla1 = tabla1;
    }

    public Hilo(JProgressBar progBar, JProgressBar progBar2, boolean avanzar, Compilador e, JTable tabla1) {
        this.progBar = progBar;
        this.progBar2 = progBar2;
        this.avanzar = avanzar;
        this.e = e;
        this.tabla1 = tabla1;
    }

    public Hilo() {
    }

    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public JProgressBar getProgBar2() {
        return progBar2;
    }

    public void setProgBar2(JProgressBar progBar2) {
        this.progBar2 = progBar2;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = true;
    }

    public Compilador getE() {
        return e;
    }

    public void setE(Compilador e) {
        this.e = e;
    }

    public JTable getTabla1() {
        return tabla1;
    }

    public void setTabla1(JTable tabla1) {
        this.tabla1 = tabla1;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "Hilo{" + "progBar=" + progBar + ", progBar2=" + progBar2 + ", avanzar=" + avanzar + ", e=" + e + ", tabla1=" + tabla1 + '}';
    }

    @Override
    public void run() {
        while (true) {
            int cont = 0;
            if (avanzar) {
                progBar.setMaximum(10);
                progBar2.setMaximum(10);
                // progBar2.setValue(progBar.getValue() + 1);
                //progBar.setValue(progBar.getValue() + 1);
                progBar.setValue(progBar.getValue() + 1);
                //float codigo=123;
                //String d="ERROR LEXICO";
                this.f=0.00;
                double n1=15.00,n2=15.00,n3=20.00,n4=10.00,n5=5.00,n6=25.00;
                if (progBar.getValue() == 1) {
                    if (e.getLexico() < 300) {
                        float codigo = 13233;
                        String d = "ERROR LEXICO";
                        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
                        n1=0.00;
                        Object newRow[] = {
                            codigo, d};

                        modelo.addRow(newRow);

                        tabla1.setModel(modelo);
                    }
                
                    //comienzo
                    progBar.setValue(0);
                    progBar.setValue(progBar.getValue() + 1);
                    if (progBar.getValue() == 1) {
                        if (e.getSintatico() < 300) {
                            float codigo = 1324;
                            String d = "ERROR SINTATICO";
                            DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
                            n2=0.00;
                            Object newRow[] = {
                                codigo, d};

                            modelo.addRow(newRow);

                            tabla1.setModel(modelo);
                        }
                    }
                    //comienzo
                    progBar.setValue(0);
                    progBar.setValue(progBar.getValue() + 1);
                    if (progBar.getValue() == 1) {
                        if (e.getSemantico() < 800) {
                            float codigo = 123235;
                            String d = "ERROR SEMANTICO";
                            DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
                            n3=0.00;
                            Object newRow[] = {
                                codigo, d};

                            modelo.addRow(newRow);

                            tabla1.setModel(modelo);
                        }
                    }
                }
                
                  /*
                
                
                
                
                */
                  progBar2.setValue(progBar2.getValue() + 1);
                //float codigo=123;
                //String d="ERROR LEXICO";
                if (progBar2.getValue() == 1) {
                    if (e.getIntermedio() < 1200) {
                        float codigo = 12343242;
                        String d = "ERROR INTERMEDIO";
                        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();

                        Object newRow[] = {
                            codigo, d};

                        modelo.addRow(newRow);
                        n4=0.00;
                        tabla1.setModel(modelo);
                    }
                
                    //comienzo
                    progBar2.setValue(0);
                    progBar2.setValue(progBar2.getValue() + 1);
                    if (progBar2.getValue() == 1) {
                        if (e.getOptimizador()< 1200) {
                            float codigo = 12331232;
                            String d = "ERROR OPTIMIZADOR";
                            DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();

                            Object newRow[] = {
                                codigo, d};

                            modelo.addRow(newRow);
                            n5=0.00;
                            tabla1.setModel(modelo);
                        }
                    }
                    //comienzo
                    progBar2.setValue(0);
                    progBar2.setValue(progBar2.getValue() + 1);
                    if (progBar2.getValue() == 1) {
                        if (e.getGenerador() < 500) {
                            float codigo = 126786785;
                            String d = "ERROR GENERADOR";
                            DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();

                            Object newRow[] = {
                                codigo, d};

                            modelo.addRow(newRow);
                            n6=0.00;
                            tabla1.setModel(modelo);
                        }
                    }
                }
                this.f=n1+n2+n3+n4+n5+n6;
                
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }

        }
    }

}
