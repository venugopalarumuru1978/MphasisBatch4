package coms.FileUploadAndDownloadServiceApp.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseUrlInfo {

	private String filename;
	private int filesize;
	private String fileUrl;
}
