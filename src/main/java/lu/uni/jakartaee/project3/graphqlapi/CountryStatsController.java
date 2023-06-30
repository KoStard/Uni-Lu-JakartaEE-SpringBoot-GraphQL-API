package lu.uni.jakartaee.project3.graphqlapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
public class CountryStatsController {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private Optional<List<CountryStats>> countryStatsCache = Optional.empty();

    @QueryMapping
    public List<CountryStats> countryStatsByCountryName(@Argument("names") List<String> names) throws IOException {
        return getCountryStats()
                .stream()
                .filter(countryStats -> names.contains(countryStats.getCountry()))
                .toList();
    }

    private List<CountryStats> getCountryStats() throws IOException {
        if (countryStatsCache.isEmpty()) {
            Resource resource = new ClassPathResource("CovidCasesByCountries.json");
            countryStatsCache = Optional.of(objectMapper.readValue(resource.getInputStream(),
                    new TypeReference<>() {
                    }));
        }
        return countryStatsCache.get();
    }
}
