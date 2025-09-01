package edu.pict.userManagement.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profile {
    private String name;

    @Lob
    @Basic(fetch = FetchType.LAZY) // hint; may require enhancement/weaving for true lazy
    @Column(name = "avatar_image", columnDefinition = "BLOB")
    private byte[] avatarImage;

    @Column(name = "avatar_mime_type", length = 100)
    private String avatarMimeType; // e.g., "image/png", "image/jpeg"

    private String bio;
    private String country;
}
