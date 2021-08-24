package app.services;

import app.repositories.RewardRepository;
import org.springframework.stereotype.Service;

@Service
public class RewardService {

    private final RewardRepository rewardRepository;

    public RewardService(RewardRepository rewardRepository) {
        this.rewardRepository = rewardRepository;
    }
}
