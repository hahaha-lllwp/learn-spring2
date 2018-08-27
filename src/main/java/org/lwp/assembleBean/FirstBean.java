package org.lwp.assembleBean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data
//@Getter
@Component
public class FirstBean {
    @Autowired
    private SecondBean secondBean;

    /*public FirstBean(SecondBean secondBean) {
        this.secondBean = secondBean;
    }*/

    public FirstBean() {
    }
}
