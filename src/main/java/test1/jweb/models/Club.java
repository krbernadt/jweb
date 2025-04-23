package test1.jweb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clubs")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // Renamed from `title` to `name` for better clarity

    private String photoUrl;

    private String content;

    @CreationTimestamp
    private LocalDateTime createdOn;

    @UpdateTimestamp // Updated to reflect that this field is modified, not just created
    private LocalDateTime updatedOn;
}