package com.nomspdx.api.service.external;

import com.nomspdx.api.model.effects.Effects;
import com.nomspdx.api.model.flowers.Flowers;
import com.nomspdx.api.model.strains.Strains;
import org.springframework.http.ResponseEntity;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * Created by chris.anatalio on 12/4/16.
 */
public interface CannabisReportsService {

    ResponseEntity<Strains> getStrains(String sort, String page);

    Effects getEffectsByUcpc(String ucpc);

    Flowers getFlowers(String sort, String page);
}
