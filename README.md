# GraphQL API for COVID Data

This project is a GraphQL API built with Spring Boot. It serves as an interface to the COVID data available at https://disease.sh/v3/covid-19/countries.

## Features

- Get COVID statistics for one or multiple countries.
- Returns:
  - Number of cases
  - Number of deaths
  - Other available functions

## Installation

This project uses Maven for dependency management. To install the project:

1. Download the repository
2. Navigate to the project directory:

   ```
    cd graphqlapi
   ```

3. Install the project and run:

   ```
    mvn clean install
   ```

## Running the Application

You can run the application using the following command:

```
mvn spring-boot:run
```

Once the application is running, you can access the GraphQL API at http://localhost:8080/exercise3 with curl or 
other clients, or you can open the http://localhost:8080/exercise3_iql for visual interface.

## Usage

To use the API, send a POST request to the `/exercise3` endpoint with a GraphQL query in the request body. For example, you might send the following query to get the number of COVID cases and deaths in the US and Canada:

```sh
curl -X POST -H "Content-Type: application/json" --data-raw '{ "query": "{ countryStatsByCountryName(names: [\"US\", \"Canada\"]) { cases, deaths } }" }' http://localhost:8080/exercise3
```

The response will be a JSON object containing the requested data.

To use the visual interface, use this:
```
{
  countryStatsByCountryName(names: ["US", "Canada"]) {
    cases
    deaths
  }
}
```

## Data Source

The data for this API is sourced from https://disease.sh/v3/covid-19/countries. The data is downloaded and stored locally, then parsed into a JSON file when the API is accessed.
