# Google Info Retriever

This project is a simple Selenium Java program to retrieve the title, URL, and source code from `google.com`.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- You have installed Java (JDK 8 or later).
- You have installed Maven.
- You have a web browser (Firefox) installed.
- You have internet access to download the necessary dependencies.

## Setup

1. **Clone the repository**:
    ```sh
    git clone https://github.com/Abdul-Firoz-Khan/GoogleInfoRetriever.git
    cd GoogleInfoRetriever
    ```

2. **Install dependencies**:
    The project uses [WebDriverManager](https://github.com/bonigarcia/webdrivermanager) to handle the browser driver binaries. When you run the application, WebDriverManager will automatically download the required binaries.

## Usage

1. **Compile the project**:
    ```sh
    mvn compile
    ```

2. **Run the application**:
    ```sh
    mvn exec:java -Dexec.mainClass="GoogleInfoRetriever"
    ```

    Alternatively, you can run the `GoogleInfoRetriever` class directly from your IDE if you prefer.

## Code Explanation

The `GoogleInfoRetriever` class performs the following actions:

1. **Setup WebDriverManager**:
    WebDriverManager is used to manage the driver binaries automatically.

    ```java
    WebDriverManager.firefoxdriver().setup();
    ```

2. **Create a new instance of FirefoxDriver**:
    A new instance of `FirefoxDriver` is created using the `WebDriver` interface.

    ```java
    WebDriver driver = new FirefoxDriver();
    ```

3. **Navigate to Google**:
    The driver navigates to the Google homepage.

    ```java
    driver.get("https://www.google.com");
    ```

4. **Retrieve and print the title and URL**:
    The title and current URL of the page are retrieved and printed to the console.

    ```java
    String title = driver.getTitle();
    System.out.println("Title: " + title);

    String url = driver.getCurrentUrl();
    System.out.println("URL: " + url);
    ```

5. **Close the browser**:
    The browser is closed to clean up resources.

    ```java
    driver.quit();
    ```

## Contributing

Contributions are always welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

```

Make sure to update the repository URL and your username in the `git clone` command and other places as necessary. Save this content into a file named `README.md` in the root directory of your project.
