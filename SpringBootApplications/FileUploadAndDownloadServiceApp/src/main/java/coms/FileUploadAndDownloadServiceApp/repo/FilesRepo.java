package coms.FileUploadAndDownloadServiceApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.FileUploadAndDownloadServiceApp.entities.FilesInfo;

@Repository
public interface FilesRepo extends JpaRepository<FilesInfo, String> {

}
