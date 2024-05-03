package coms.FileUploadAndDownloadServiceApp.entities;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Files_Infos")
@Getter
@Setter
public class FilesInfo {

	@Id
	@GeneratedValue(generator = "uuid")
 	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String fileid;
	
	private String filename;
	private String filetype;
	
	@Lob // it will refer in database column type as Blob(Binary Large Objects).
	@Column(columnDefinition="LONGBLOB")
	private byte[] filedata;
}
