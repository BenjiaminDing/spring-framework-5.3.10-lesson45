package com.zhouyu.requestScope;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;

/**
 * created     by benjiamin at 2022-11-03 / 23:08 /08
 */
@RequestScope(proxyMode = ScopedProxyMode.TARGET_CLASS )
public class Tree {
}
