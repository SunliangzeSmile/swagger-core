/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.models.info;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * try this at home for fun!
 *
 * @link https://github.com/OAI/OpenAPI-Specification/blob/3.0.0-rc0/versions/3.0.md#infoObject
 */
@ApiModel(description = "try this at home for fun!")

public class Info {
  @JsonProperty("title")
  private String title = null;
  @JsonProperty("description")
  private String description = null;
  @JsonProperty("termsOfService")
  private String termsOfService = null;
  @JsonProperty("contact")
  private Contact contact = null;
  @JsonProperty("license")
  private License license = null;
  @JsonProperty("version")
  private String version = null;
  private java.util.Map<String, Object> extensions = null;

  /**
   * returns the title property from a Info instance.
   *
   * @return String title
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Info title(String title) {
    this.title = title;
    return this;
  }

  /**
   * returns the description property from a Info instance.
   *
   * @return String description
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Info description(String description) {
    this.description = description;
    return this;
  }

  /**
   * returns the termsOfService property from a Info instance.
   *
   * @return String termsOfService
   **/
  @ApiModelProperty(value = "")
  public String getTermsOfService() {
    return termsOfService;
  }

  public void setTermsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
  }

  public Info termsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
    return this;
  }

  /**
   * returns the contact property from a Info instance.
   *
   * @return Contact contact
   **/
  @ApiModelProperty(value = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Info contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * returns the license property from a Info instance.
   *
   * @return License license
   **/
  @ApiModelProperty(value = "")
  public License getLicense() {
    return license;
  }

  public void setLicense(License license) {
    this.license = license;
  }

  public Info license(License license) {
    this.license = license;
    return this;
  }

  /**
   * returns the version property from a Info instance.
   *
   * @return String version
   **/
  @ApiModelProperty(required = true, value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Info version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Info info = (Info) o;
    return Objects.equals(this.title, info.title) &&
        Objects.equals(this.description, info.description) &&
        Objects.equals(this.termsOfService, info.termsOfService) &&
        Objects.equals(this.contact, info.contact) &&
        Objects.equals(this.license, info.license) &&
        Objects.equals(this.version, info.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, termsOfService, contact, license, version);
  }


  public java.util.Map<String, Object> getExtensions() {
    return extensions;
  }

  public void addExtension(String name, Object value) {
    if(this.extensions == null) {
      this.extensions = new java.util.HashMap<>();
    }
    this.extensions.put(name, value);
  }

  public void setExtensions(java.util.Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Info {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    termsOfService: ").append(toIndentedString(termsOfService)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

