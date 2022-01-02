package com.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeerDTO {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    public static BeerDTOBuilder builder() {
        return new BeerDTOBuilder();
    }

    public static class BeerDTOBuilder {

        private UUID id;
        private String beerName;
        private String beerStyle;
        private Long upc;

        BeerDTOBuilder() {
        }

        public BeerDTOBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public BeerDTOBuilder beerName(String beerName) {
            this.beerName = beerName;
            return this;
        }

        public BeerDTOBuilder beerStyle(String beerStyle) {
            this.beerStyle = beerStyle;
            return this;
        }

        public BeerDTOBuilder upc(Long upc) {
            this.upc = upc;
            return this;
        }

        public BeerDTO build() {
            return new BeerDTO(id, beerName, beerStyle, upc);
        }

        public String toString() {
            return "BeerDTO.BeerDTOBuilder(id=" + this.id + ", beerName=" + this.beerName + ", beerStyle=" + this.beerStyle + ", upc=" + this.upc +
                   ")";
        }
    }
}
