package demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="grade")
public class Grade {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private Integer gid;
     private String gname;
     
}
