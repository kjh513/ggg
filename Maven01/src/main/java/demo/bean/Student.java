package demo.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="student")
public class Student {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer sid;
    private String sname;
    private String sex;
    private Date  hire;
    private Integer gid;
    
    @ManyToOne
    private Grade grade;
    
    
    
}
