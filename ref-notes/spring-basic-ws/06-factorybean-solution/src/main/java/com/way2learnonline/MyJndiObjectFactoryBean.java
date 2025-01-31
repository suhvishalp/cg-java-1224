package com.way2learnonline;

import java.util.Properties;

import javax.naming.InitialContext;

import org.springframework.beans.factory.config.AbstractFactoryBean;
	
	public class MyJndiObjectFactoryBean extends AbstractFactoryBean<Object>{
		
		private String jndiName;
		
		private Properties jndiProperties;
	
		@Override
		protected Object createInstance() throws Exception {
			
			InitialContext context= new InitialContext(jndiProperties);
			Object jndiObject= context.lookup(jndiName);		
			return jndiObject;
		}
	
		@Override
		public Class<?> getObjectType() {		
			return Object.class;
		}

		public String getJndiName() {
			return jndiName;
		}

		public void setJndiName(String jndiName) {
			this.jndiName = jndiName;
		}

		public Properties getJndiProperties() {
			return jndiProperties;
		}

		public void setJndiProperties(Properties jndiProperties) {
			this.jndiProperties = jndiProperties;
		}
		
		
		
	
	}

	