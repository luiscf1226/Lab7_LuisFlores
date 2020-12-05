
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
                if (progBar.getValue() == 1) {
                    if (e.getLexico() < 300) {
                        float codigo = 123;
                        String d = "ERROR LEXICO";
                        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();

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
                            float codigo = 1234;
                            String d = "ERROR SINTATICO";
                            DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();

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
                            float codigo = 12345;
                            String d = "ERROR SEMANTICO";
                            DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();

                            Object newRow[] = {
                                codigo, d};

                            modelo.addRow(newRow);

                            tabla1.setModel(modelo);
                        }
                    }
                    //fin progres bar 1
                    //
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }

        }
    }

}
