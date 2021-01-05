package my.example.app;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = DefaultEntity.class
)
@JsonSubTypes({
    @JsonSubTypes.Type(
        value = FacilityEntity.class,
        name = "FACILITY"
    )
})
abstract class NamedEntity {

    public final NamedEntityType type;

    private String entity;

    public NamedEntity(NamedEntityType type) {
        this.type = type;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

}