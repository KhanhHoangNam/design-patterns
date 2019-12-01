package com.khanhhn.design_patterns.structural_patterns.facade;

public class SocialMediaShare {
    private FacebookShare facebookShare;
    private TwitterShare twitterShare;

    public SocialMediaShare(FacebookShare facebookShare, TwitterShare twitterShare) {
        this.facebookShare = facebookShare;
        this.twitterShare = twitterShare;
    }

    public void share(String message) {
        this.facebookShare.setMessage(message);
        this.facebookShare.share();

        this.twitterShare.setMessage(message);
        this.twitterShare.share();
    }
}
