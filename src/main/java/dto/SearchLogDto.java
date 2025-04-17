package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link entity.SearchLog}
 */
@Getter
@Setter
public class SearchLogDto implements Serializable {
    Long id;
    String keyword;
    Double latitude;
    Double longitude;
    Double radiusKm;
}