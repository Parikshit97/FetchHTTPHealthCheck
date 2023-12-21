package example.url;

public class FetchEndpoint {
    private String name;
    private String url;
    private String method;
    private Headers headers;
    private String body;

    public FetchEndpoint() {
    }

    public FetchEndpoint(String name, String url, String method, Headers headers, String body) {
        this.name = name;
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public Headers getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public void setBody(String body) {
        this.body = body;
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
