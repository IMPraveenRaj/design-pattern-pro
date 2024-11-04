package com.springheaven.cglibproxy.cglibproxy;

import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// creating the product instance
		Product product = new Product();
		// creating a factory here
		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
		proxyFactoryBean.setTarget(product);
		// Product productProxy=(Product)proxyFactoryBean.getObject();

		//Iproduct iproductProxy = (Product) proxyFactoryBean.getObject();
		// above line will throw an error
		// class jdk.proxy1.$Proxy0 cannot be cast to class
		// com.springheaven.cglibproxy.cglibproxy.Product (jdk.proxy1.$Proxy0 is in
		// module jdk.proxy1 of loader 'app';
		// com.springheaven.cglibproxy.cglibproxy.Product is in unnamed module of loader
		// 'app')
		Iproduct iproductProxy = (Iproduct) proxyFactoryBean.getObject();

		iproductProxy.showProductInfo();
	}
}
