package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {


	private static final long serialVersionUID = 1L;
	
		private Integer id;
		private  String name;
		private String email;
		private Date bithDate;
		private Double baseSalary;
		
		
		private Department department;
		
		public Seller () {
			
		}

		public Seller(Integer id, String name, String email, Date bithDate, Double baseSalary, Department department) {
			this.id = id;
			this.name = name;
			this.email = email;
			this.bithDate = bithDate;
			this.baseSalary = baseSalary;
			this.department = department;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Seller other = (Seller) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", baseSalary=" + baseSalary
					+ ", department=" + department + "]";
		}

		public void setId(int int1) {
			// TODO Auto-generated method stub
			
		}

		public void setName(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setBirthDate(java.sql.Date date) {
			// TODO Auto-generated method stub
			
		}

		public void setBaseSalary(double double1) {
			// TODO Auto-generated method stub
			
		}

		public void setEmail(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setDepartment(Department dep) {
			// TODO Auto-generated method stub
			
		}
		
		
}
