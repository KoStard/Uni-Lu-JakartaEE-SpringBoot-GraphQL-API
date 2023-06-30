package lu.uni.jakartaee.project3.graphqlapi;

public class CountryStats {
    private long updated;
    private String country;
    private CountryInfo countryInfo;
    private int cases;
    private int todayCases;
    private int deaths;
    private int todayDeaths;
    private int recovered;
    private int todayRecovered;
    private int active;
    private int critical;
    private float casesPerOneMillion;
    private float deathsPerOneMillion;
    private int tests;
    private float testsPerOneMillion;
    private int population;
    private String continent;
    private float oneCasePerPeople;
    private float oneDeathPerPeople;
    private float oneTestPerPeople;
    private float activePerOneMillion;
    private float recoveredPerOneMillion;
    private float criticalPerOneMillion;

    public long getUpdated() {
        return updated;
    }

    public String getCountry() {
        return country;
    }

    public CountryInfo getCountryInfo() {
        return countryInfo;
    }

    public int getCases() {
        return cases;
    }

    public int getTodayCases() {
        return todayCases;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getTodayDeaths() {
        return todayDeaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public int getTodayRecovered() {
        return todayRecovered;
    }

    public int getActive() {
        return active;
    }

    public int getCritical() {
        return critical;
    }

    public float getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public float getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public int getTests() {
        return tests;
    }

    public float getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public int getPopulation() {
        return population;
    }

    public String getContinent() {
        return continent;
    }

    public float getOneCasePerPeople() {
        return oneCasePerPeople;
    }

    public float getOneDeathPerPeople() {
        return oneDeathPerPeople;
    }

    public float getOneTestPerPeople() {
        return oneTestPerPeople;
    }

    public float getActivePerOneMillion() {
        return activePerOneMillion;
    }

    public float getRecoveredPerOneMillion() {
        return recoveredPerOneMillion;
    }

    public float getCriticalPerOneMillion() {
        return criticalPerOneMillion;
    }
}
