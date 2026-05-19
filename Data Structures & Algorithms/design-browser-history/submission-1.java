class BrowserHistory {
    private Page current;

    public BrowserHistory(String homepage) {
        current = new Page(homepage);
    }
    
    public void visit(String url) {
        var newPage = new Page(url);
        current.connect(newPage);
        current = current.next;
    }
    
    public String back(int steps) {
        for (int i = 0; i < steps && current.prev != null; i++) {
            current = current.prev;
        }
        return current.url;
    }
    
    public String forward(int steps) {
        for (int i = 0; i < steps && current.next != null; i++) {
            current = current.next;
        }
        return current.url;
    }

    class Page {
        String url;
        Page prev;
        Page next;
        Page(String url) {
            this.url = url;
        }
        void connect(Page page) {
            if (this.next != null) {
                this.next.prev = null;
            }
            this.next = page;
            page.prev = this;
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */