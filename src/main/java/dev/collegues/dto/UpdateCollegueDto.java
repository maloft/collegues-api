package dev.collegues.dto;

import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

public class UpdateCollegueDto {

	private String photoUrl;
	private String email;
	
	public UpdateCollegueDto() {
	}
	
	public UpdateCollegueDto(@NotBlank String photoUrl, @NotBlank String email) {
		this.photoUrl = photoUrl;
		this.email = email;
	}

	/** Getter
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/** Setter
	 * @param photoUrl the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	/** Getter
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/** Setter
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	
}
