class Twitter {

    private Map<Integer, List<int[]>> userTweets;  // userId -> list of [timestamp, tweetId]
    private Map<Integer, Set<Integer>> followers;   // userId -> set of followed userIds
    private int timestamp;  // global timestamp counter
    private static final int FEED_SIZE = 10;
    
    public Twitter() {
        userTweets = new HashMap<>();
        followers = new HashMap<>();
        timestamp = 0;
    }
    
    public void postTweet(int userId, int tweetId) {
        userTweets.putIfAbsent(userId, new ArrayList<>());
        userTweets.get(userId).add(new int[]{timestamp++, tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        // Get all tweets from the user and their followed users
        List<int[]> allTweets = new ArrayList<>();
        
        // Add user's own tweets
        if (userTweets.containsKey(userId)) {
            allTweets.addAll(userTweets.get(userId));
        }
        
        // Add tweets from followed users
        Set<Integer> followedUsers = followers.getOrDefault(userId, new HashSet<>());
        for (int followedId : followedUsers) {
            if (userTweets.containsKey(followedId)) {
                allTweets.addAll(userTweets.get(followedId));
            }
        }
        
        // Sort by timestamp in descending order (most recent first)
        allTweets.sort((a, b) -> b[0] - a[0]);
        
        // Return top 10 tweet IDs
        List<Integer> feed = new ArrayList<>();
        for (int i = 0; i < Math.min(FEED_SIZE, allTweets.size()); i++) {
            feed.add(allTweets.get(i)[1]);
        }
        return feed;
    }
    
    public void follow(int followerId, int followeeId) {
        if(followerId == followeeId) return;
        followers.putIfAbsent(followerId, new HashSet<>());
        followers.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (followers.containsKey(followerId)) {
            followers.get(followerId).remove(followeeId);
        }
    }

}
