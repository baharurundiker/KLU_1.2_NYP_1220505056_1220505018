package org.example;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
public class GraphQLClient {

    private final GraphQL graphQL;

    public GraphQLClient() {
        // GraphQL şemasını tanımlayın
        String graphqlSchema = "type Query { hello: String }";
        SchemaParser schemaParser = new SchemaParser();
        TypeDefinitionRegistry typeRegistry = schemaParser.parse(graphqlSchema);

        // Runtime wiring ayarlarını yapın
        RuntimeWiring wiring = RuntimeWiring.newRuntimeWiring()
                .type("Query", builder -> builder.dataFetcher("hello", environment -> "world"))
                .build();

        // GraphQL şemasını oluşturun
        SchemaGenerator schemaGenerator = new SchemaGenerator();
        GraphQLSchema graphQLSchema = schemaGenerator.makeExecutableSchema(typeRegistry, wiring);

        // GraphQL nesnesini oluşturun
        this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    public Object executeQuery(String query) {
        // GraphQL sorgusunu yürütmek için yazıldı
        ExecutionResult result = graphQL.execute(query);

      if (result.getErrors() != null && !result.getErrors().isEmpty()) {
              // Hataları yazdır veya logla
            System.out.println("GraphQL sorgu hatası: " + result.getErrors());
        }


        return result.getData();
    }

}