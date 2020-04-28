class DSU {
    int parent[], rank[];
    int count;

    DSU(int n) {
        count=n;
        parent = new int[n + 1];
        rank = new int[n + 1];
        for (int i = 1; i <= n; i++)
            parent[i] = i;
    }

    int find(int p) {
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    boolean add(int u, int v) {
        int par_u = find(u);
        int par_v = find(v);
        if (par_u == par_v)
            return false;

        if (rank[par_u] < rank[par_v])
            parent[par_u] = par_v;
        else {
            parent[par_v] = par_u;
            if (rank[par_u] == rank[par_v])
                rank[par_u]++;
        }
        --count;
        return true;
    }
    int count()
    {
        return count;
    }
    
}