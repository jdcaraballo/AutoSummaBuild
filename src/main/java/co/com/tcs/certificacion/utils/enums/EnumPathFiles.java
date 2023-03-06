package co.com.tcs.certificacion.utils.enums;

public enum EnumPathFiles {
  FILE_VALID("C:\\Users\\2462952\\Downloads\\TestUpload\\PlantillaAuxiliosCorta00.xlsx"),
  FILE_INVALID("WEBVIEW");

  private final String path;

  EnumPathFiles(String path) {
    this.path = path;
  }

  public String getPath() {
    return path;
  }
}
