import gql from 'graphql-tag';

// Query to get Total Company, Contact and Deal Counts
export const DASHBOARD_TOTAL_COUNTS_QUERY = gql`
    query DashboardTotalCounts {
        companies {
            totalCount
        }
        contacts {
            totalCount
        }
        deals{
            totalCount
        }
    }
`;

// Query to get upcoming events
