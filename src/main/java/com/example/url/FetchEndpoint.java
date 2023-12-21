package example.url;

import java.util.Map;
import java.util.Objects;

public class FetchEndpoint {
    private String name;
    private String url;
    private String method;
    private Map<String, String> headers;
    private String body;

    public FetchEndpoint() {
    }

    public FetchEndpoint(String name,
                         String url,
                         String method,
                         Map<String, String> headers,
                         String body) {
        this.name = name;
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FetchEndpoint that = (FetchEndpoint) o;
        return Objects.equals(name, that.name) && Objects.equals(url, that.url) && Objects.equals(method, that.method) && Objects.equals(headers, that.headers) && Objects.equals(body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, url, method, headers, body);
    }

    @Override
    public String toString() {
        return "FetchEndpoint{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", body='" + body + '\'' +
                '}';
    }
}
