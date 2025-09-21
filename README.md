# Kill-Browser

`kill-browser` is a small Java utility library to help automate closing or managing browser instances. It is designed to be lightweight, easy to integrate, and works with standard Selenium setups.

## Features
- Close all browser instances safely
- Works with Selenium WebDriver
- Lightweight and easy to add as a dependency

## Usage

### Using GitHub Packages

Add the following to your `pom.xml` to use the library directly from GitHub:

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/notxkcd/kill-browser</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>io.github.notxkcd</groupId>
        <artifactId>kill-browser</artifactId>
        <version>1.0.3</version>
    </dependency>
</dependencies>
````

Make sure to configure your GitHub credentials in `settings.xml` for Maven:

```xml
<server>
    <id>github</id>
    <username>YOUR_GITHUB_USERNAME</username>
    <password>YOUR_GITHUB_PERSONAL_ACCESS_TOKEN</password>
</server>
```

### Using Maven Central (Sonatype)

If you prefer Maven Central, simply add the dependency:

```xml
<dependency>
    <groupId>io.github.notxkcd</groupId>
    <artifactId>kill-browser</artifactId>
    <version>1.0.3</version>
</dependency>
```

Maven will automatically resolve it from Sonatype's Maven Central repository.

## Example

```java
import org.shahid.util.KillBrowser;

public class Main {
    public static void main(String[] args) {
        KillBrowser.closeAll(); // Example method to close all browsers
    }
}
```

## Contributing

Contributions, issues, and feature requests are welcome. Please open a GitHub issue or pull request.

## License

This project is licensed under the MIT License.

