package org.lwp.spring;

import java.io.PrintStream;

public class HaveAStream {

    private PrintStream ps;

    private FirstBean firstBean;

    public HaveAStream(PrintStream ps, FirstBean firstBean) {
        this.ps = ps;
        this.firstBean = firstBean;
    }

    public HaveAStream() {
    }

    public HaveAStream(PrintStream ps) {
        this.ps = ps;
    }

    public PrintStream getPs() {
        return ps;
    }

    public void setPs(PrintStream ps) {
        this.ps = ps;
    }

    public FirstBean getFirstBean() {
        return firstBean;
    }

    public void setFirstBean(FirstBean firstBean) {
        this.firstBean = firstBean;
    }

    public void sayHello(){
        ps.println("Hello");
    }

}
