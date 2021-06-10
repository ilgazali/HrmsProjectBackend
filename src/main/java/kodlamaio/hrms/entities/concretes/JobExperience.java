package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_experiences")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cvs"})
public class JobExperience {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "workplace_name")
	private String workplaceName;
	
	@Column(name = "job_position")
	private String jobPosition;
	
	@Column(name = "start_date_of_work")
	private String startDateOfWork;
	
	@Nullable
	@Column(name = "end_date_of_work")
	private String endDateOfWork;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobExperience")
    private List<CV> cvs;
}