package com.example.gs04_uploading_files;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

  /**
   * folder location for storage files
   */
  private String location = "upload-dir";

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
