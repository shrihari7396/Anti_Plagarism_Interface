package edu.pict.ecommerce.authservice.model;

import jakarta.persistence.*;
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
    @Lob
    @Basic(fetch = FetchType.LAZY) // hint; may require enhancement/weaving for true lazy
    @Column(name = "avatar_image", columnDefinition = "BLOB")
    private byte[] avatarImage;

    @Column(name = "avatar_mime_type", length = 100)
    private String avatarMimeType; // e.g., "image/png", "image/jpeg"

    private String bio;
    private String country;
}
