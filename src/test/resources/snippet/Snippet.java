package snippet;

public class Snippet {
	
		<build>
	
	
			<pluginManagement><!-- lock down plugins versions to avoid using Maven 
					defaults (may be moved to parent pom) -->
				<plugins>
					<!-- clean lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#clean_Lifecycle -->
					<plugin>
						<artifactId>maven-clean-plugin</artifactId>
						<version>3.1.0</version>
					</plugin>
					<!-- default lifecycle, jar packaging: see https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
					<plugin>
						<artifactId>maven-resources-plugin</artifactId>
						<version>3.0.2</version>
					</plugin>
					<plugin>
						<artifactId>maven-compiler-plugin</artifactId>
						<version>3.8.0</version>
						<configuration>
							<source>${jdk.version}</source>
							<target>${jdk.version}</target>
	<!--						<argLine>-Xmx6144m</argLine>-->
						</configuration>
					</plugin>
					<plugin>
						<artifactId>maven-surefire-plugin</artifactId>
						<version>2.22.0</version>
						<configuration>
							<argLine>-Xmx6144m</argLine>
							<testFailureIgnore>true</testFailureIgnore>
							<includes>
								<include>**/RunnerClass.java</include>
							</includes>
						</configuration>
					</plugin>
	
					<!-- <plugin> <artifactId>maven-jar-plugin</artifactId> <version>3.0.2</version> 
						</plugin> <plugin> <artifactId>maven-install-plugin</artifactId> <version>2.5.2</version> 
						</plugin> <plugin> <artifactId>maven-deploy-plugin</artifactId> <version>2.8.2</version> 
						</plugin> site lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#site_Lifecycle 
						<plugin> <artifactId>maven-site-plugin</artifactId> <version>3.7.1</version> 
						</plugin> <plugin> <artifactId>maven-project-info-reports-plugin</artifactId> 
						<version>3.0.0</version> </plugin> -->
				</plugins>
			</pluginManagement>
			<plugins>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-compiler-plugin</artifactId>
					<version>3.8.1</version>
					<configuration>
						<source>8</source>
						<target>8</target>
					</configuration>
				</plugin>
			</plugins>
		</build>
	
}

