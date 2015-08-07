package com.event.Model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "Services")

	public class Services {
		@Id @GeneratedValue
		private int ID;
		 
	    private String ServiceName;
	    

		
		
		public Services(){
			
		}

		 public Services(int ID, String ServiceName) {
			super();

			
			this.ServiceName = ServiceName;
	
			
			this.ID=ID;
		}
		
		 
		public int getID() {
			return ID;
		}
		public void setID(int ID) {
			this.ID = ID;
		}

		public String getServiceName() {
			return ServiceName;
		}

		public void setServiceName(String ServiceName) {
			this.ServiceName = ServiceName;
		}
		
		


}
