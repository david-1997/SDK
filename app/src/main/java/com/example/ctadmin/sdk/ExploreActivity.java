package com.example.ctadmin.sdk;

import com.example.ctadmin.sdk.fragment.PostListFragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class ExploreActivity extends PostListFragment {

    public ExploreActivity() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START recent_posts_query]
        // Last 100 posts, these are automatically the 100 most recent
        // due to sorting by push() keys
        Query recentPostsQuery = databaseReference.child("posts")
                .limitToFirst(100);
        // [END recent_posts_query]

        return recentPostsQuery;
    }
}
