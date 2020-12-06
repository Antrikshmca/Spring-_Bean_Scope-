package com.antriksh.sigletondemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sigleton")
//@Scope("Singleton")
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonDemo {

}