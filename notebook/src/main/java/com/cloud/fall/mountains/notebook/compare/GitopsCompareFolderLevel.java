package com.cloud.fall.mountains.notebook.compare;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class GitopsCompareFolderLevel {

    /**
     * corporate user mup
     */
    public static Path[] app_corporate_user_mup_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/corporate/user/mup/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/corporate/user/mup/base")
    };
    public static Path[] app_corporate_user_mup_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/corporate/user/mup/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/corporate/user/mup/overlays/qa.volvoc3.cn")
    };

    //=======================================================================

    /**
     * internal data migration ping datasync
     */
    public static Path[] app_internal_data_migration_ping_datasync_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/data-migration/ping-datasync/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/data-migration/ping-datasync/base")
    };
    public static Path[] app_internal_data_migration_ping_datasync_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/data-migration/ping-datasync/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/data-migration/ping-datasync/overlays/qa.volvoc3.cn")
    };

    /**
     * internal pd user admin tool
     */
    public static Path[] app_internal_pd_user_admin_tool_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/pd-user-admin-tool/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/pd-user-admin-tool/base")
    };
    public static Path[] app_internal_pd_user_admin_tool_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/pd-user-admin-tool/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/pd-user-admin-tool/overlays/qa.volvoc3.cn")
    };

    /**
     * internal pd user admin tool web
     */
    public static Path[] app_internal_pd_user_admin_tool_web_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/pd-user-admin-tool-web/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/pd-user-admin-tool-web/base")
    };
    public static Path[] app_internal_pd_user_admin_tool_web_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/pd-user-admin-tool-web/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/pd-user-admin-tool-web/overlays/qa.volvoc3.cn")
    };

    /**
     * internal user user
     */
    public static Path[] app_internal_user_user_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/user/user/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/user/user/base")
    };
    public static Path[] app_internal_user_user_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/user/user/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/user/user/overlays/qa.volvoc3.cn")
    };

    /**
     * internal user message dispatcher
     */
    public static Path[] app_internal_user_message_dispatcher_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/user-message-dispatcher/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/user-message-dispatcher/base")
    };
    public static Path[] app_internal_user_message_dispatcher_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/user-message-dispatcher/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/user-message-dispatcher/overlays/qa.volvoc3.cn")
    };

    /**
     * internal volvoid adaptor
     */
    public static Path[] app_internal_volvoid_adaptor_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/volvoid-adaptor/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/volvoid-adaptor/base")
    };
    public static Path[] app_internal_volvoid_adaptor_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/volvoid-adaptor/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/volvoid-adaptor/overlays/qa")
    };

    /**
     * internal volvoid event bridge
     */
    public static Path[] app_internal_volvoid_event_bridge_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/volvoid-event-bridge/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/volvoid-event-bridge/base")
    };
    public static Path[] app_internal_volvoid_event_bridge_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internal/volvoid-event-bridge/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internal/volvoid-event-bridge/overlays/qa.c3.cn")
    };

    //=======================================================================

    /**
     * internet infra olympus olympus apollo
     */
    public static Path[] app_internet_infra_olympus_olympus_apollo_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/infra--olympus/olympus-apollo/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/infra--olympus/olympus-apollo/base")
    };
    public static Path[] app_internet_infra_olympus_olympus_apollo_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/infra--olympus/olympus-apollo/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/infra--olympus/olympus-apollo/overlays/qa.volvoc3.cn")
    };

    /**
     * internet infra olympus ping dataconsole
     */
    public static Path[] app_internet_infra_olympus_ping_dataconsole_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/infra--olympus/ping-dataconsole/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/infra--olympus/ping-dataconsole/base")
    };
    public static Path[] app_internet_infra_olympus_ping_dataconsole_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/infra--olympus/ping-dataconsole/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/infra--olympus/ping-dataconsole/overlays/qa.volvoc3.cn")
    };

    /**
     * internet infra olympus ping datasync
     */
    public static Path[] app_internet_infra_olympus_ping_datasync_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/infra--olympus/ping-datasync/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/infra--olympus/ping-datasync/base")
    };
    public static Path[] app_internet_infra_olympus_ping_datasync_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/infra--olympus/ping-datasync/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/infra--olympus/ping-datasync/overlays/qa.volvoc3.cn")
    };

    /**
     * internet volvoid account api
     */
    public static Path[] app_internet_volvoid_account_api_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/account-api/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/volvoid/account-api/base")
    };
    public static Path[] app_internet_volvoid_account_api_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/account-api/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/volvoid/account-api/overlays/qa.volvoc3.cn")
            // eu qa compare cn qa
//            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/volvoid/account-api/overlays/eu.qa.volvoc3.com")
    };

    /**
     * internet volvoid volvoid portal external
     */
    public static Path[] app_internet_volvoid_volvoid_portal_external_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/volvoid-portal-external/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/volvoid/volvoid-portal-external/base")
    };
    public static Path[] app_internet_volvoid_volvoid_portal_external_components = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/volvoid-portal-external/components"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/volvoid/volvoid-portal-external/components")
    };
    public static Path[] app_internet_volvoid_volvoid_portal_external_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/volvoid-portal-external/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/volvoid/volvoid-portal-external/overlays/qa.volvoc3.cn")
    };

    /**
     * internet volvoid volvoid portal frontend
     */
    public static Path[] app_internet_volvoid_volvoid_portal_frontend_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/volvoid-portal-frontend/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/volvoid/volvoid-portal-frontend/base")
    };
    public static Path[] app_internet_volvoid_volvoid_portal_frontend_components = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/volvoid-portal-frontend/components"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/volvoid/volvoid-portal-frontend/components")
    };
    public static Path[] app_internet_volvoid_volvoid_portal_frontend_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/volvoid-portal-frontend/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/volvoid/volvoid-portal-frontend/overlays/qa.volvoc3.cn")
    };

    //=======================================================================

    /**
     * partner user tsp user proxy
     */
    public static Path[] app_partner_user_tsp_user_proxy_base = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/partner/user/tsp-user-proxy/base"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/partner/user/tsp-user-proxy/base")
    };
    public static Path[] app_partner_user_tsp_user_proxy_overlays_qa = {
            Path.of("/Users/xzhu54/work/global/lab/dragonite-gitops/app/partner/user/tsp-user-proxy/overlays/cn.c3.qa"),
            Path.of("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/partner/user/tsp-user-proxy/overlays/qa.volvoc3.cn")
    };


    public static void main(String[] args) {

        Map<String, Path[]> map = new LinkedHashMap<>();
        //app_corporate_user_mup_base
        map.put("app_corporate_user_mup_base", app_corporate_user_mup_base);
        //app_corporate_user_mup_overlays_qa
        map.put("app_corporate_user_mup_overlays_qa", app_corporate_user_mup_overlays_qa);
        //app_internal_data_migration_ping_datasync_base
        map.put("app_internal_data_migration_ping_datasync_base", app_internal_data_migration_ping_datasync_base);
        //app_internal_data_migration_ping_datasync_overlays_qa
        map.put("app_internal_data_migration_ping_datasync_overlays_qa", app_internal_data_migration_ping_datasync_overlays_qa);
        //app_internal_pd_user_admin_tool_base
        map.put("app_internal_pd_user_admin_tool_base", app_internal_pd_user_admin_tool_base);
        //app_internal_pd_user_admin_tool_overlays_qa
        map.put("app_internal_pd_user_admin_tool_overlays_qa", app_internal_pd_user_admin_tool_overlays_qa);
        //app_internal_pd_user_admin_tool_web_base
        map.put("app_internal_pd_user_admin_tool_web_base", app_internal_pd_user_admin_tool_web_base);
        //app_internal_pd_user_admin_tool_web_overlays_qa
        map.put("app_internal_pd_user_admin_tool_web_overlays_qa", app_internal_pd_user_admin_tool_web_overlays_qa);
        //app_internal_user_user_base
        map.put("app_internal_user_user_base", app_internal_user_user_base);
        //app_internal_user_user_overlays_qa
        map.put("app_internal_user_user_overlays_qa", app_internal_user_user_overlays_qa);
        //app_internal_user_message_dispatcher_base
        map.put("app_internal_user_message_dispatcher_base", app_internal_user_message_dispatcher_base);
        //app_internal_user_message_dispatcher_overlays_qa
        map.put("app_internal_user_message_dispatcher_overlays_qa", app_internal_user_message_dispatcher_overlays_qa);
        //app_internal_volvoid_adaptor_base
        map.put("app_internal_volvoid_adaptor_base", app_internal_volvoid_adaptor_base);
        //app_internal_volvoid_adaptor_overlays_qa
        map.put("app_internal_volvoid_adaptor_overlays_qa", app_internal_volvoid_adaptor_overlays_qa);
        //app_internal_volvoid_event_bridge_base
        map.put("app_internal_volvoid_event_bridge_base", app_internal_volvoid_event_bridge_base);
        //app_internal_volvoid_event_bridge_overlays_qa
        map.put("app_internal_volvoid_event_bridge_overlays_qa", app_internal_volvoid_event_bridge_overlays_qa);
        //app_internet_infra_olympus_olympus_apollo_base
        map.put("app_internet_infra_olympus_olympus_apollo_base", app_internet_infra_olympus_olympus_apollo_base);
        //app_internet_infra_olympus_olympus_apollo_overlays_qa
        map.put("app_internet_infra_olympus_olympus_apollo_overlays_qa", app_internet_infra_olympus_olympus_apollo_overlays_qa);
        //app_internet_infra_olympus_ping_dataconsole_base
        map.put("app_internet_infra_olympus_ping_dataconsole_base", app_internet_infra_olympus_ping_dataconsole_base);
        //app_internet_infra_olympus_ping_dataconsole_overlays_qa
        map.put("app_internet_infra_olympus_ping_dataconsole_overlays_qa", app_internet_infra_olympus_ping_dataconsole_overlays_qa);
        //app_internet_infra_olympus_ping_datasync_base
        map.put("app_internet_infra_olympus_ping_datasync_base", app_internet_infra_olympus_ping_datasync_base);
        //app_internet_infra_olympus_ping_datasync_overlays_qa
        map.put("app_internet_infra_olympus_ping_datasync_overlays_qa", app_internet_infra_olympus_ping_datasync_overlays_qa);
        //app_internet_volvoid_account_api_base
        map.put("app_internet_volvoid_account_api_base", app_internet_volvoid_account_api_base);
        //app_internet_volvoid_account_api_overlays_qa
        map.put("app_internet_volvoid_account_api_overlays_qa", app_internet_volvoid_account_api_overlays_qa);
        //app_internet_volvoid_volvoid_portal_external_base
        map.put("app_internet_volvoid_volvoid_portal_external_base", app_internet_volvoid_volvoid_portal_external_base);
        //app_internet_volvoid_volvoid_portal_external_components
        map.put("app_internet_volvoid_volvoid_portal_external_components", app_internet_volvoid_volvoid_portal_external_components);
        //app_internet_volvoid_volvoid_portal_external_overlays_qa
        map.put("app_internet_volvoid_volvoid_portal_external_overlays_qa", app_internet_volvoid_volvoid_portal_external_overlays_qa);
        //app_internet_volvoid_volvoid_portal_frontend_base
        map.put("app_internet_volvoid_volvoid_portal_frontend_base", app_internet_volvoid_volvoid_portal_frontend_base);
        //app_internet_volvoid_volvoid_portal_frontend_components
        map.put("app_internet_volvoid_volvoid_portal_frontend_components", app_internet_volvoid_volvoid_portal_frontend_components);
        //app_internet_volvoid_volvoid_portal_frontend_overlays_qa
        map.put("app_internet_volvoid_volvoid_portal_frontend_overlays_qa", app_internet_volvoid_volvoid_portal_frontend_overlays_qa);
        //app_partner_user_tsp_user_proxy_base
        map.put("app_partner_user_tsp_user_proxy_base", app_partner_user_tsp_user_proxy_base);
        //app_partner_user_tsp_user_proxy_overlays_qa
        map.put("app_partner_user_tsp_user_proxy_overlays_qa", app_partner_user_tsp_user_proxy_overlays_qa);


        map.forEach((key, value) -> {
            System.out.println("-----------------------" + key + "-----------------------");
            try {
                diff(value[0], value[1]);
            } catch (IOException e) {
                if (e instanceof NoSuchFileException) {
                    System.out.println("?????????????????? no such file ????????????????????");
                    System.out.println(e.getMessage());
                    System.out.println("?????????????????? no such file ????????????????????");
                } else {
                    throw new RuntimeException(e);
                }
            }
        });
    }


    public static void diff(Path one, Path other) throws IOException {
        Files.walkFileTree(one, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path filePath, BasicFileAttributes attrs) throws IOException {
                FileVisitResult result = super.visitFile(filePath, attrs);
                // get the relative file name from path "one"
                Path relativize = one.relativize(filePath);
                // construct the path for the counterpart file in "other"
                Path fileInOther = other.resolve(relativize);
                String dragon = filePath.toString();
                String[] splitFirst = dragon.split("dragonite-gitops");
                splitFirst[0] = splitFirst[0] + "dragonite-gitops                 ";
                dragon = splitFirst[0] + splitFirst[1];

                if (dragon.contains("overlays")) {
                    String[] splitSecond = dragon.split("cn.c3.qa");
                    splitSecond[0] = splitSecond[0] + "cn.c3.qa     ";
                    dragon = splitSecond[0] + splitSecond[1];
                }

                String global = fileInOther.toString();
                dragon = dragon.split("/Users/xzhu54/work/global/lab/")[1];
                global = global.split("/Users/xzhu54/work/global/lab/")[1];
                print(dragon, global);

                byte[] otherBytes = Files.readAllBytes(fileInOther);
                byte[] theseBytes = Files.readAllBytes(filePath);
                if (!Arrays.equals(otherBytes, theseBytes)) {
                    System.out.println("******************************diff******************************");
                    System.out.println(dragon + "\n" + global);
                    System.out.println("******************************diff******************************");
                }
                return result;
            }
        });
    }

    public static void print(String dragon, String global) {
//        System.out.println("start comparing: \n" + dragon + " \n" + global);
    }
}
